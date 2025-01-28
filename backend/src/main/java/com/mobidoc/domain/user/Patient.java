package com.mobidoc.domain.user;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "patients")
public class Patient extends User {
    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column
    private String address;

    @Column(name = "medical_history")
    private String medicalHistory;

    @Column(name = "emergency_contact")
    private String emergencyContact;

    @PrePersist
    @Override
    protected void onCreate() {
        super.onCreate();
        this.setRole(UserRole.PATIENT);
    }
}