package ir.isc.cif.api;

import ir.isc.cif.dto.CustomerInformationFileDto;

import java.util.List;

public interface CifService {
    List<CustomerInformationFileDto> findAll();
}
