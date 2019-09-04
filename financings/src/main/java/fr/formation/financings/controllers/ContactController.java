package fr.formation.financings.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.services.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    protected void createClients(@Valid @RequestBody ContactDto dto) {
	service.create(dto);
    }

    @GetMapping("/{id}")
    protected Contact getOne(@PathVariable("id") Long id) {
	return service.getOne(id);
    }

    @DeleteMapping("/{id}")
    protected void deleteOne(@PathVariable("id") Long id) {
	service.delete(id);
    }

    @PutMapping("/{id}")
    protected void updateOne(@PathVariable("id") Long id,
	    @Valid @RequestBody ContactDto dto) {
	service.update(id, dto);
    }
}
