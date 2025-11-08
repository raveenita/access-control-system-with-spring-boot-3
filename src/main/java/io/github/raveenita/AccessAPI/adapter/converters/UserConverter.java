package io.github.raveenita.AccessAPI.adapter.converters;

import io.github.raveenita.AccessAPI.adapter.dtos.UserDTO;
import io.github.raveenita.AccessAPI.core.domain.Person;
import io.github.raveenita.AccessAPI.core.domain.User;
import org.springframework.stereotype.Component;

@Component // what this means?
public class UserConverter {
    public User toDomain(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getEmail(), userDTO.getUsername(), userDTO.getPassword(),  userDTO.getIsAdministrator(), new Person(null, userDTO.getUsername()));
    }

    public UserDTO toDTO(User user) {
        return new UserDTO(user.getId(), user.getEmail(), user.getName(), user.getPassword(), user.getAdmin(), user.getPerson());
    }
}
