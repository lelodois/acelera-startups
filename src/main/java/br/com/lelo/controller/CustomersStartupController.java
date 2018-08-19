package br.com.lelo.controller;

import br.com.lelo.domain.CustomerStartup;
import br.com.lelo.service.search.CustomerStartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/customers/startup/")
public class CustomersStartupController extends CustomerController {

    @Autowired
    protected CustomerStartupService service;

    @PostMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<CustomerStartup> neww(
            @Valid @RequestBody CustomerStartup customer) {

        return ResponseEntity.ok(service.save(customer));
    }

    @GetMapping("{id}")
    @CrossOrigin(origins = "*")
    public ResponseEntity<CustomerStartup> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    @CrossOrigin(origins = "*")
    public ResponseEntity<Iterable<CustomerStartup>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }


}
