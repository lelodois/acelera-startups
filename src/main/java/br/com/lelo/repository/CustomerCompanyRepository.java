package br.com.lelo.repository;

import br.com.lelo.domain.CustomerCompany;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface CustomerCompanyRepository extends CrudRepository<CustomerCompany, Long> {

}
