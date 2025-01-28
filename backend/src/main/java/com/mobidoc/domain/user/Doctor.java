package com.mobidoc.domain.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "doctors")
public class Doctor extends User {
    @Column(nullable = false)
    private String specialization;

    @Column(name = "license_number", nullable = false, unique = true)
    private String licenseNumber;

    @Column
    private String biography;

    @PrePersist
    @Override
    protected void onCreate() {
        super.onCreate();
        this.setRole(UserRole.DOCTOR);
    }
}