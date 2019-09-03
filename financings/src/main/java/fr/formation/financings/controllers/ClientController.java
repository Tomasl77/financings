package fr.formation.financings.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.entities.Client;
import fr.formation.financings.services.ClientService;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService service;

    @PostMapping
    protected void createClients(@Valid @RequestBody ClientDto dto) {
	service.create(dto);
    }

    @GetMapping("/{id}")
    protected Client getOne(@PathVariable("id") Long id) {
	return service.getOne(id);
    }

    @DeleteMapping("/{id}")
    protected void deleteOne(@PathVariable("id") Long id) {
	service.delete(id);
    }

    @PutMapping("/{id}")
    protected void updateOne(@RequestBody @PathVariable("id") Long id) {
	// Do the put client
    }
}
