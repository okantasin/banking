package com.java.ft.technology.banking.entities.abstracts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity {

    @Column(name = "DATE_CREATED", updatable = false)
    private LocalDateTime dateCreated;

    @Column(name = "CUSER", updatable = false)
    private Long cUser;

    @Column(name = "DATE_UPDATED")
    private LocalDateTime dateUpdated;

    @Column(name = "UUSER")
    private Long uUser;

    @PrePersist
    public void onCreate(){
        this.cUser = 1L;
        this.dateCreated = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate(){
        this.uUser = 1L;
        this.dateUpdated = LocalDateTime.now();
    }
}
