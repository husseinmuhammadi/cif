package ir.isc.cif.service;

import ir.isc.cif.api.CifService;
import ir.isc.cif.dto.CustomerInformationFileDto;

import java.util.ArrayList;
import java.util.List;

public class CifServiceImpl implements CifService {
    @Override
    public List<CustomerInformationFileDto> findAll() {
        return new ArrayList<>();
    }
}
