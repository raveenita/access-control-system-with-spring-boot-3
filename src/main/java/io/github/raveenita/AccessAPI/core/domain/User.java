package io.github.raveenita.AccessAPI.core.domain;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Person person;
    private Boolean isAdmin;

    public User() {

    }

    // Getters and Setters

    public User(Long id, String name, String email, String password, Boolean isAdmin, Person person) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public Person getPerson() {
        return person;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}