package io.github.raveenita.AccessAPI.adapter.repositories;

import io.github.raveenita.AccessAPI.adapter.entities.UserEntity;
import io.github.raveenita.AccessAPI.core.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional once we extend from JpaRepository
public interface UserRepository extends JpaRepository <UserEntity, Long> {
    UserEntity findByEmail(String email);
}
