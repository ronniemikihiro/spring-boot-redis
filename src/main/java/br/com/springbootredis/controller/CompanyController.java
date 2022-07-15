package br.com.springbootredis.controller;

import br.com.springbootredis.service.CompanyService;
import br.com.springbootredis.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping
    public List<Company> findAll() {
        return companyService.findAll();
    }

    @GetMapping("/{id}")
    public Company findById(@PathVariable("id") final Long id) {
        return companyService.findById(id);
    }

    @PostMapping
    public Company create(@RequestBody final Company company) {
        return companyService.create(company);
    }

    @PutMapping
    public Company update(@RequestBody final Company company) {
        return companyService.update(company);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") final Long id) {
        companyService.delete(id);
    }

}
