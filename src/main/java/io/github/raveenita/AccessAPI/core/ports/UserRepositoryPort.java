package io.github.raveenita.AccessAPI.core.ports;

import io.github.raveenita.AccessAPI.core.domain.User;

public interface UserRepositoryPort {
    public User create(User user);

    public User obtainByEmail(String email);
}
