package fr.formation.financings.services;

import fr.formation.financings.dtos.ClientDto;
import fr.formation.financings.entities.Client;

public class ClientService {

    void create(ClientDto dto);

    void delete(Long id);

    Client getOne(Long id);
}
