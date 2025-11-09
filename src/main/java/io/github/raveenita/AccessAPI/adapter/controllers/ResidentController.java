package io.github.raveenita.AccessAPI.adapter.controllers;

import io.github.raveenita.AccessAPI.adapter.converters.ResidentConverter;
import io.github.raveenita.AccessAPI.adapter.dtos.ResidentDTO;
import io.github.raveenita.AccessAPI.core.domain.Resident;
import io.github.raveenita.AccessAPI.core.ports.ResidentServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/residents")
@RequiredArgsConstructor
public class ResidentController {
    private final ResidentServicePort residentServicePort;
    private final ResidentConverter residentConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResidentDTO create(@RequestBody ResidentDTO residentDTO) {
        Resident newResident = residentServicePort.create(residentConverter.toDomain(residentDTO));

        return residentConverter.toDTO(newResident);
    }
}
