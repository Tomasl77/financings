package fr.formation.financings.dtos;

import javax.persistence.Embedded;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ContactDto {

    @NotBlank
    @Size(max = 255)
    private String firstName;

    @NotBlank
    @Size(max = 255)
    private String lastName;

    @Embedded
    private ContactInfoDto info;

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

    public ContactInfoDto getInfo() {
	return info;
    }

    public void setInfo(ContactInfoDto info) {
	this.info = info;
    }
}
