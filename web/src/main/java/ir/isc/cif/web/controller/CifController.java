package ir.isc.cif.web.controller;

import ir.isc.cif.api.CifService;
import ir.isc.cif.dto.CustomerInformationFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/cifs")
public class CifController {
    @Autowired
    CifService service;

    @GetMapping
    public ResponseEntity<List<CustomerInformationFile>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<CustomerInformationFile> save(@RequestBody CustomerInformationFile cif) {
        return ResponseEntity.ok(service.save(cif));
    }
}
