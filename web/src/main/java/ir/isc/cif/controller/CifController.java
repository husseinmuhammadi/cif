package ir.isc.cif.controller;

import ir.isc.cif.api.CifService;
import ir.isc.cif.dto.CustomerInformationFileDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v1/cifs")
public class CifController {
    @Autowired
    CifService service;

    public ResponseEntity<List<CustomerInformationFileDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
