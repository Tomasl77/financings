package fr.formation.financings.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.financings.dtos.FinancingDto;
import fr.formation.financings.dtos.FinancingViewDto;
import fr.formation.financings.services.FinancingService;

@RestController
@RequestMapping("/financings")
public class FinancingController {

    @Autowired
    private FinancingService service;

    @PostMapping
    protected void create(@Valid @RequestBody FinancingDto dto) {
	service.create(dto);
    }

    @DeleteMapping("/{id}")
    protected void delete(@PathVariable("id") Long id) {
	service.delete(id);
    }

    @GetMapping("/{id}")
    protected FinancingViewDto getOne(@PathVariable("id") Long id) {
	return service.getOne(id);
    }

    @PatchMapping("/{id}/validated")
    protected void validate(@PathVariable("id") Long id) {
	service.validate(id);
    }
}
