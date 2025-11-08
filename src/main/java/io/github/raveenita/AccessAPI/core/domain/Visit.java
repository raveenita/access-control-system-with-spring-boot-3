package io.github.raveenita.AccessAPI.core.domain;

import java.time.LocalDateTime;

public class Visit {
    private Long id;
    private LocalDateTime hour;
    private Long idResident;
    private Long idVisitant;

    public Visit(Long id, LocalDateTime hour, Long idResident, Long idVisitant) {
        this.id = id;
        this.hour = hour;
        this.idResident = idResident;
        this.idVisitant = idVisitant;
    }
}
