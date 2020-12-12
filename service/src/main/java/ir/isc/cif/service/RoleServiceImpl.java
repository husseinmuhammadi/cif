package ir.isc.cif.service;

import ir.isc.cif.api.RoleService;
import ir.isc.cif.dto.Role;
import ir.isc.cif.mapper.RoleMapper;
import ir.isc.cif.repository.RoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImplBase<ir.isc.cif.to.Role> implements RoleService {

    public static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    private RoleMapper mapper;

    @Autowired
    RoleRepository repository;

    protected RoleServiceImpl() {
        super(ir.isc.cif.to.Role.class);
    }

    @Override
    JpaRepository getRepository() {
        return repository;
    }

    @Override
    public Role findByName(String name) {
        return mapper.fromRole(repository.findByName(name));
    }

    @Override
    public boolean exists(String name){
        return repository.existsByName(name);
    }
}
