package io.github.raveenita.AccessAPI.core.ports;

import io.github.raveenita.AccessAPI.core.domain.Resident;

public interface ResidentRepositoryPort {
    public Resident create(Resident resident);
    public Resident findByCpf(String cpf);
}
