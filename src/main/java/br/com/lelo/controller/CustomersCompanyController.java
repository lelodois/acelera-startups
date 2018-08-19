package br.com.lelo.controller;

import br.com.lelo.domain.CustomerCompany;
import br.com.lelo.service.search.CustomerCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/customers/company/")
public class CustomersCompanyController extends CustomerController {

    @Autowired
    protected CustomerCompanyService service;


    @PostMapping
    public ResponseEntity<Void> neww(
            @Valid @RequestBody CustomerCompany customer) {

        CustomerCompany saved = service.save(customer);
        return this.location(saved.getId());
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerCompany> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<Iterable<CustomerCompany>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

}