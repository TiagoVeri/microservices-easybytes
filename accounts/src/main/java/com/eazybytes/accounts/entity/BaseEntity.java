package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

/*
    Class holds all common attributes from other entities
*/
@MappedSuperclass
@Getter @Setter @ToString
public class BaseEntity {

    @Column(updatable = false)// to not update the original value from this field
    private LocalDateTime createdAt;

    @Column(updatable = false)
    private String createdBy;

    @Column(insertable = false) // to not insert any data initially
    private LocalDateTime updatedAt;

    @Column(insertable = false)
    private String updatedBy;
}
