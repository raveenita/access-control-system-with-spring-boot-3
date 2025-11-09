package io.github.raveenita.AccessAPI.adapter.converters;

import io.github.raveenita.AccessAPI.adapter.dtos.ResidentDTO;
import io.github.raveenita.AccessAPI.core.domain.Resident;

public class ResidentConverter {
    public Resident toDomain(ResidentDTO residentDTO) {
        return new Resident(residentDTO.getId(), residentDTO.getCpf(), residentDTO.getAddress(), residentDTO.getPhone(), residentDTO.getName());
    }

    public ResidentDTO toDTO(Resident resident) {
        return new ResidentDTO(resident.getId(),
                resident.getCpf(),
                resident.getAddress(),
                resident.getPhone(),
                resident.getName());
    }
}
