package br.com.lelo.controller;

import br.com.lelo.domain.CustomerStartup;
import br.com.lelo.service.search.CustomerStartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/customers/startup/")
public class CustomersStartupController extends CustomerController {

    @Autowired
    protected CustomerStartupService service;

    @PostMapping
    public ResponseEntity<Void> neww(
            @Valid @RequestBody CustomerStartup customer) {

        CustomerStartup saved = service.save(customer);
        return this.location(saved.getId());
    }

    @GetMapping("{id}")
    public ResponseEntity<CustomerStartup> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<Iterable<CustomerStartup>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }


}
