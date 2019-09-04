package fr.formation.financings.dtos;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import fr.formation.financings.entities.LegalForm;

public class ClientDto {

    @NotBlank
    @Size(max = 255)
    private String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    private LegalForm legalForm;

    private Long contactId;

    public ClientDto() {
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Long getContactId() {
	return contactId;
    }

    public void setContactId(Long contactId) {
	this.contactId = contactId;
    }

    public LegalForm getLegalForm() {
	return legalForm;
    }

    public void setLegalForm(LegalForm legalForm) {
	this.legalForm = legalForm;
    }
}
