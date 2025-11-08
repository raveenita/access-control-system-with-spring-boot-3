package io.github.raveenita.AccessAPI.core.ports;

import io.github.raveenita.AccessAPI.core.domain.User;

public interface UserServicePort {
    User createUser(User user);
}
