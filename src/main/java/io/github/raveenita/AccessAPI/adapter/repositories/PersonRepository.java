package io.github.raveenita.AccessAPI.adapter.repositories;

import io.github.raveenita.AccessAPI.adapter.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
}
