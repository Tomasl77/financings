package fr.formation.financings.dtos;

import fr.formation.financings.entities.Contact;

public interface FinancingViewDto {

    String getReference();

    Double getAmount();

    Double getRate();

    String getClientName();

    Contact getLastName();

    Contact getFirstName();
}
