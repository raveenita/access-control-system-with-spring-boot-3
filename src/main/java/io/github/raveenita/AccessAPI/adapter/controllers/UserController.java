package io.github.raveenita.AccessAPI.adapter.controllers;

import io.github.raveenita.AccessAPI.adapter.converters.UserConverter;
import io.github.raveenita.AccessAPI.adapter.dtos.UserDTO;
import io.github.raveenita.AccessAPI.core.domain.User;
import io.github.raveenita.AccessAPI.core.ports.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor // WHAT THIS MEANS?!
public class UserController {

    private final UserServicePort userServicePort; // use final to use the object after define in the constructor
    private final UserConverter userConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody UserDTO userDTO) {
        User user = userServicePort.createUser(userConverter.toDomain(userDTO));
        return userConverter.toDTO(user);
    }
}
