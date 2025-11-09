package io.github.raveenita.AccessAPI.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_resident")
@NoArgsConstructor
@AllArgsConstructor
@Data // generate getters and setters automatically]
public class ResidentEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String cpf;
    private String phone;
    private String address;

    @OneToOne
    @JoinColumn(name = "id_person")
    private PersonEntity person;

}
