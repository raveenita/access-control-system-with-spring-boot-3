package io.github.raveenita.AccessAPI.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_person")
@NoArgsConstructor
@AllArgsConstructor
@Data // generate getters and setters automatically
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long Id;
    private String name;
}
