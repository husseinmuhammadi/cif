package ir.isc.cif.service;

import ir.isc.cif.api.CifService;
import ir.isc.cif.dto.CustomerInformationFileDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CifServiceImpl implements CifService {
    @Override
    public List<CustomerInformationFileDto> findAll() {
        return new ArrayList<>();
    }
}
