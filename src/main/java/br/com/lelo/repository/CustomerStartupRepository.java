package br.com.lelo.repository;

import br.com.lelo.domain.CustomerStartup;
import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface CustomerStartupRepository extends CrudRepository<CustomerStartup, Long> {

}
