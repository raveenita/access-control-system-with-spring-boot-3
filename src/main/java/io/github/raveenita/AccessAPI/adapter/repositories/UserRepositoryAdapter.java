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
    private final PersonRepositoryAdapter personRepository;
    private final ModelMapper modelMapper;

    @Override
    public User create(User user) {
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userEntity.setPerson(personRepository.createPerson(userEntity.getPerson()));
        UserEntity newUser = userRepository.save(userEntity);

        return modelMapper.map(newUser, User.class);
    }

    @Override
    public User findByEmail(String email) {
        UserEntity userByEmail = userRepository.findByEmail(email);

        if (userByEmail == null){
            return null;
        }

        return modelMapper.map(userByEmail, User.class);
    }
}
