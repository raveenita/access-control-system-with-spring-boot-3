package io.github.raveenita.AccessAPI.adapter.repositories;

import io.github.raveenita.AccessAPI.adapter.entities.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional once we extend from JpaRepository
public interface ResidentRepository extends JpaRepository <ResidentEntity, Long> {
    ResidentEntity findByCpf(String cpf);
}
