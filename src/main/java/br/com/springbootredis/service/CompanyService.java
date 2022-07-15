package br.com.springbootredis.service;

import br.com.springbootredis.repository.CompanyRepository;
import br.com.springbootredis.exception.EntityNotFoundException;
import br.com.springbootredis.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Cacheable(cacheNames = Company.CACHE_NAME, key="#root.method.name")
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @Cacheable(cacheNames = Company.CACHE_NAME, key="#id")
    public Company findById(final Long id) {
        return companyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Id not found: " + id));
    }

    @CacheEvict(cacheNames = Company.CACHE_NAME, allEntries = true)
    public Company create(final Company company) {
        return companyRepository.save(company);
    }

    @CachePut(cacheNames = Company.CACHE_NAME, key="#company.getId()")
    public Company update(final Company company) {
        if(Objects.isNull(company.getId())) {
            throw new EntityNotFoundException("Identifier is empty");
        }
        return companyRepository.save(company);
    }

    @CacheEvict(cacheNames = Company.CACHE_NAME, key="#id")
    public void delete(final Long id) {
        if(Objects.isNull(id)) {
            throw new EntityNotFoundException("Id is empty");
        }
        companyRepository.deleteById(id);
    }
}
