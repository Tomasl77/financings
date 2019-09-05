package fr.formation.financings.services;

import java.util.List;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.dtos.ContactViewDto;

public interface ContactService {

    void create(ContactDto dto);

    void delete(Long id);

    ContactViewDto getOne(Long id);

    List<ContactViewDto> getAll();

    void update(Long id, ContactDto dto);
}
