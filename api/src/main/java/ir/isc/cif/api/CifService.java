package ir.isc.cif.api;

import ir.isc.cif.dto.CustomerInformationFile;

import java.util.List;

public interface CifService {
    List<CustomerInformationFile> findAll();

    CustomerInformationFile save(CustomerInformationFile cif);
}
