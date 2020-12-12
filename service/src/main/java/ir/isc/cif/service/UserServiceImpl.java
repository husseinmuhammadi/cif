package ir.isc.cif.service;

import ir.isc.cif.api.UserService;
import ir.isc.cif.dto.User;
import ir.isc.cif.mapper.UserMapper;
import ir.isc.cif.repository.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl extends ServiceImplBase<ir.isc.cif.to.User> implements UserService {

    public static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper mapper;

    @Autowired
    UserRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public UserServiceImpl() {
        super(ir.isc.cif.to.User.class);
    }

    @Override
    public User findByUsername(String username) {
        return mapper.fromUser(repository.findByUsername(username));
    }

    @Override
    public User save(User user) {
        final String username = user.getUsername().toLowerCase();
        user.setUsername(username);

        if (repository.existsById(user.getUsername())) {
            LOGGER.warn("User {} already exists, it will be updated", username);
        }

        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));

        return mapper.fromUser(repository.save(mapper.toUser(user)));
    }

    @Override
    public boolean exists(User user) {
        return repository.existsById(user.getUsername().toLowerCase());
    }

    @Override
    public List<User> findAll() {
        return repository.findAll()
                .stream().map(mapper::fromUser)
                .collect(Collectors.toList());
    }

    @Override
    JpaRepository getRepository() {
        return repository;
    }
}
