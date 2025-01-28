package ci.mobidoc.userservice.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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