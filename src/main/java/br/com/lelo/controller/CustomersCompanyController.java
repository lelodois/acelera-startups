package br.com.lelo.controller;

import br.com.lelo.domain.CustomerCompany;
import br.com.lelo.service.search.CustomerCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/customers/company/")
public class CustomersCompanyController extends CustomerController {

    @Autowired
    protected CustomerCompanyService service;

    @PostMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<CustomerCompany> neww(
            @Valid @RequestBody CustomerCompany customer) {

        return ResponseEntity.ok(service.save(customer));
    }

    @GetMapping("{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<CustomerCompany> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<Iterable<CustomerCompany>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}