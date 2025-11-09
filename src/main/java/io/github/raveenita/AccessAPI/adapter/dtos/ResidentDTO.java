package io.github.raveenita.AccessAPI.adapter.dtos;

import io.github.raveenita.AccessAPI.core.domain.Person;

public class ResidentDTO {
    private Long id;
    private String cpf;
    private String address;
    private String phone;
    private String name;

    public ResidentDTO(Long id, String cpf, String address, String phone, String name) {
        this.id = id;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }
}
