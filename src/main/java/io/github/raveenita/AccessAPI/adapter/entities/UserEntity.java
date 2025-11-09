package io.github.raveenita.AccessAPI.adapter.entities;

import io.github.raveenita.AccessAPI.core.domain.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_user")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long Id;
    private String email;
    private String password;
    private Boolean administrator;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;


}
