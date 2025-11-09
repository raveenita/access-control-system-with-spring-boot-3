package io.github.raveenita.AccessAPI.adapter.repositories;

import io.github.raveenita.AccessAPI.adapter.entities.ResidentEntity;
import io.github.raveenita.AccessAPI.core.domain.Resident;
import io.github.raveenita.AccessAPI.core.ports.ResidentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component // turns on spring management
@RequiredArgsConstructor
public class ResidentRepositoryAdapter implements ResidentRepositoryPort {
    private final ResidentRepository residentRepository;
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    @Override
    public Resident create(Resident resident) {
        ResidentEntity residentByCpf = residentRepository.findByCpf(resident.getCpf());

        ResidentEntity entity = modelMapper.map(resident, ResidentEntity.class);
        ResidentEntity newResident = residentRepository.save(entity);

        return modelMapper.map(newResident, Resident.class);
    }

    @Override
    public Resident findByCpf(String cpf) {
        ResidentEntity residentByCpf = residentRepository.findByCpf(cpf);

        return modelMapper.map(residentByCpf, Resident.class);
    }


}
