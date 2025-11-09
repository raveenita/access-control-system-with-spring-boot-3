package io.github.raveenita.AccessAPI.adapter.repositories;

import io.github.raveenita.AccessAPI.adapter.entities.PersonEntity;
import io.github.raveenita.AccessAPI.core.domain.Person;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component // what this means?
@RequiredArgsConstructor //  what this means?
public class PersonRepositoryAdapter {
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    public Person createPerson(Person person) {
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);

        return personRepository.save(personEntity);
    }
}
