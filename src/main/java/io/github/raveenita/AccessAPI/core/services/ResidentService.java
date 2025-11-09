package io.github.raveenita.AccessAPI.core.services;

import io.github.raveenita.AccessAPI.core.domain.Resident;
import io.github.raveenita.AccessAPI.core.ports.ResidentRepositoryPort;
import io.github.raveenita.AccessAPI.core.ports.ResidentServicePort;

public class ResidentService implements ResidentServicePort {
    private final ResidentRepositoryPort residentRepositoryPort;

    public ResidentService(ResidentRepositoryPort residentRepositoryPort) {
        this.residentRepositoryPort = residentRepositoryPort;
    }

    @Override
    public Resident create(Resident resident) {
        return residentRepositoryPort.create(resident);
    }

    @Override
    public Resident findByCpf(String cpf) {
        Resident residentByCpf = residentRepositoryPort.findByCpf(cpf);

        if (residentByCpf != null){
            return null;
        }

        return residentRepositoryPort.findByCpf(cpf);
    }

}
