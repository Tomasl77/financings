package fr.formation.financings.dtos;

public interface FinancingViewDto {

    String getReference();

    Double getAmount();

    Double getRate();

    String getClientName();

    String getClientContactLastName();

    String getClientContactFirstName();
}
