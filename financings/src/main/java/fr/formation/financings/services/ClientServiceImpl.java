package fr.formation.financings.services;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.dtos.ClientViewDto;
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
	extracted(dto, client);
    }

    private void extracted(ClientDto dto, Client client) {
	client.setLegalForm(dto.getLegalForm());
	client.setName(dto.getName());
	if (dto.getContactId() != null) {
	    Contact contact = contactRepo.getOne(dto.getContactId());
	    client.setContact(contact);
	}
	clientRepo.save(client);
    }

    @Override
    public void delete(Long id) {
	clientRepo.deleteById(id);
    }

    @Override
    public ClientViewDto getOne(Long id) {
	return clientRepo.getById(id);
    }

    @Override
    public void update(Long id, ClientDto dto) {
	Client client = clientRepo.findById(id).get();
	extracted(dto, client);
    }

    @Override
    public List<ClientViewDto> getAll() {
	return clientRepo.getAllProjectedBy();
    }
}
