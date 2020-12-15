package ir.isc.cif.service;

import ir.isc.cif.api.CifService;
import ir.isc.cif.dto.CustomerInformationFile;
import ir.isc.cif.mapper.CifMapper;
import ir.isc.cif.repository.CifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CifServiceImpl implements CifService {

    @Autowired
    CifMapper mapper;

    @Autowired
    CifRepository repository;

    @Override
    public List<CustomerInformationFile> findAll() {
        return repository.findAll().stream().map(mapper::fromCustomerInformationFile).collect(Collectors.toList());
    }

    @Override
    public CustomerInformationFile save(CustomerInformationFile cif) {
        return mapper.fromCustomerInformationFile(
                repository.save(mapper.toCustomerInformationFile(cif))
        );
    }
}
