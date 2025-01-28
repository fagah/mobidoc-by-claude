package com.mobidoc.domain.user.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreatePatientDTO extends CreateUserDTO {
    @NotNull(message = "La date de naissance est obligatoire")
    @Past(message = "La date de naissance doit être dans le passé")
    private LocalDate birthDate;

    @NotBlank(message = "L'adresse est obligatoire")
    private String address;

    private String medicalHistory;

    @NotBlank(message = "Le contact d'urgence est obligatoire")
    private String emergencyContact;
}