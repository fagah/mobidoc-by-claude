package com.mobidoc.domain.user.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CreateDoctorDTO extends CreateUserDTO {
    @NotBlank(message = "La spécialisation est obligatoire")
    private String specialization;

    @NotBlank(message = "Le numéro de licence est obligatoire")
    private String licenseNumber;

    private String biography;
}