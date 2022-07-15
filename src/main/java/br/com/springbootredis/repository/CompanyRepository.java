package br.com.springbootredis.repository;

import br.com.springbootredis.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
