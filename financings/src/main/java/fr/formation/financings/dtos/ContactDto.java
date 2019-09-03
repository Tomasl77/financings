package fr.formation.financings.dtos;

import javax.persistence.Embedded;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import fr.formation.financings.entities.ContactInfo;

public class ContactDto {

    @NotBlank
    @Size(max = 255)
    private String firstName;

    @NotBlank
    @Size(max = 255)
    private String lastName;

    @Embedded // Embarquee
    private ContactInfo info;

    public ContactDto() {
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public ContactInfo getInfo() {
	return info;
    }

    public void setInfo(ContactInfo info) {
	this.info = info;
    }
}
