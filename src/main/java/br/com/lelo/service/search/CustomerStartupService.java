package br.com.lelo.service.search;

import br.com.lelo.domain.CustomerStartup;
import br.com.lelo.repository.CustomerStartupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerStartupService {

    @Autowired
    private CustomerStartupRepository repository;

    public CustomerStartup save(CustomerStartup customer) {
        customer.setCreationDate(new Date());
        return repository.save(customer);
    }

    public CustomerStartup findById(Long id) {
        return repository.findOne(id);
    }

    public Iterable<CustomerStartup> findAll() {
        return repository.findAll();
    }

}
