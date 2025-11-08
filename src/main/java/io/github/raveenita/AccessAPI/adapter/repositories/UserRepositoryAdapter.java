package io.github.raveenita.AccessAPI.adapter.repositories;

import io.github.raveenita.AccessAPI.adapter.entities.PersonEntity;
import io.github.raveenita.AccessAPI.adapter.entities.UserEntity;
import io.github.raveenita.AccessAPI.core.domain.Person;
import io.github.raveenita.AccessAPI.core.domain.User;
import io.github.raveenita.AccessAPI.core.ports.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component // turns on spring management
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {
    private final UserRepository userRepository;
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    @Override
    public User create(User user) {
        PersonEntity personEntityMap = modelMapper.map(user, PersonEntity.class);
        PersonEntity personEntity = personRepository.save(personEntityMap);

        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userEntity.setPersonEntity(personEntity);

        UserEntity newUser = userRepository.save(userEntity);

        return modelMapper.map(newUser, User.class);
    }

    @Override
    public User obtainByEmail(String email) {
        UserEntity userByEmail = userRepository.findByEmail(email);

        return modelMapper.map(userByEmail, User.class);
    }

    private PersonEntity createPerson(Person person) {
        PersonEntity personEntity = modelMapper.map(person, PersonEntity.class);

        return personRepository.save(personEntity);
    }
}
