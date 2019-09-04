package fr.formation.financings.services;

import org.springframework.stereotype.Service;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.entities.Client;
import fr.formation.financings.entities.Contact;
import fr.formation.financings.repositories.ClientRepository;
import fr.formation.financings.repositories.ContactRepository;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepo;

    private final ContactRepository contactRepo;

    protected ClientServiceImpl(ClientRepository clientRepo,
	    ContactRepository contactRepo) {
	this.clientRepo = clientRepo;
	this.contactRepo = contactRepo;
    }

    @Override
    public void create(ClientDto dto) {
	Client client = new Client();
	client.setLegalForm(dto.getLegalForm());
	client.setName(dto.getName());
	Contact contact = contactRepo.getOne(dto.getContactId());
	client.setContact(contact);
	clientRepo.save(client);
    }

    @Override
    public void delete(Long id) {
	// TODO Auto-generated method stub
    }

    @Override
    public Client getOne(Long id) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public void update(Long id) {
	// TODO Auto-generated method stub
    }
}
