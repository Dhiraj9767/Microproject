package com.dhiraj.VaccinationCentre.model;

import com.dhiraj.VaccinationCentre.Entity.VaccinationCenter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequiredResponse {
    private VaccinationCenter center;
    private List<Citizen> citizens;
}
