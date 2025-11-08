package io.github.raveenita.AccessAPI.core.services;

import io.github.raveenita.AccessAPI.core.domain.User;
import io.github.raveenita.AccessAPI.core.ports.UserRepositoryPort;
import io.github.raveenita.AccessAPI.core.ports.UserServicePort;

public class UserService implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        User existentUser = userRepositoryPort.obtainByEmail(user.getEmail());

        if(existentUser != null){
            throw new IllegalArgumentException("User already exists");
        }

        return userRepositoryPort.create(user);
    }

}
