package io.github.raveenita.AccessAPI.core.domain;

public class Visitor {
    private Long id;
    private String rg;
    private Long personId;

    public Visitor(Long id, String rg, Long personId) {
        this.id = id;
        this.rg = rg;
        this.personId = personId;
    }

    public Long getId() {
        return id;
    }

    public String getRg() {
        return rg;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }
}
