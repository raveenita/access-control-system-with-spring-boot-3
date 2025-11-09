package io.github.raveenita.AccessAPI.core.domain;

public class Resident {
    private Long id;
    private String cpf;
    private String phone;
    private String address;
    private String name;

    public Resident(Long id, String cpf, String address, String phone, String name) {
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

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }
}
