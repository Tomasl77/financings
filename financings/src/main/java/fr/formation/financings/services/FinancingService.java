package fr.formation.financings.services;

import fr.formation.financings.dtos.FinancingDto;
import fr.formation.financings.dtos.FinancingViewDto;

public interface FinancingService {

    void create(FinancingDto dto);

    void delete(Long id);

    FinancingViewDto getOne(Long id);

    void validate(Long id);
}
