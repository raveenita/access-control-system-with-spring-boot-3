package io.github.raveenita.AccessAPI.adapter.dtos;

import io.github.raveenita.AccessAPI.core.domain.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private Boolean isAdministrator;
    private Person person;
}


