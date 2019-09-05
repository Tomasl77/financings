package fr.formation.financings.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.financings.dtos.ContactDto;
import fr.formation.financings.dtos.ContactViewDto;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepo;

    @Override
    public void create(ContactDto dto) {
	Contact contact = new Contact();
	contact.setFirstName(dto.getFirstName());
	contact.setLastName(dto.getLastName());
	contact.setEmail(dto.getEmail());
	contact.setPhone(dto.getPhone());
	contact.setMobile(dto.getMobile());
	contactRepo.save(contact);
    }

    @Override
    public void delete(Long id) {
	contactRepo.deleteById(id);
    }

    @Override
    public ContactViewDto getOne(Long id) {
	return contactRepo.getById(id);
    }

    @Override
    public List<ContactViewDto> getAll() {
	return contactRepo.getAllProjectedBy();
    }

    @Override
    public void update(Long id, ContactDto dto) {
	Contact contact = contactRepo.findById(id).get();
	contact.setFirstName(dto.getFirstName());
	contact.setLastName(dto.getLastName());
	contact.setEmail(dto.getEmail());
	contact.setPhone(dto.getPhone());
	contact.setMobile(dto.getMobile());
	contactRepo.save(contact);
    }
}
