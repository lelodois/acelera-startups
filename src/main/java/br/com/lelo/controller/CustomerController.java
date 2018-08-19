package br.com.lelo.controller;

import br.com.lelo.domain.Customer;
import org.springframework.http.ResponseEntity;

public abstract class CustomerController {

    protected ResponseEntity<Customer> ok(Customer customer) {
        if (customer == null)
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok(customer);
    }

    protected ResponseEntity<Iterable<? extends Customer>> ok(Iterable<? extends Customer> customers) {
        if (!customers.iterator().hasNext())
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok(customers);
    }

}