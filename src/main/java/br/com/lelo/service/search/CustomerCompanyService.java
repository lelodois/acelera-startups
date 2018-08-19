package br.com.lelo.service.search;

import br.com.lelo.domain.CustomerCompany;
import br.com.lelo.repository.CustomerCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CustomerCompanyService {

    @Autowired
    private CustomerCompanyRepository repository;

    public CustomerCompany save(CustomerCompany customer) {
        customer.setCreationDate(new Date());
        return repository.save(customer);
    }

    public CustomerCompany findById(Long id) {
        return repository.findOne(id);
    }

    public Iterable<CustomerCompany> findAll() {
        return repository.findAll();
    }

}
