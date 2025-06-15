package com.dhiraj.VaccinationCentre.Repository;

import com.dhiraj.VaccinationCentre.Entity.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VaccinationCenterRepo extends JpaRepository<VaccinationCenter, Integer> {

    // Additional query methods can be defined here if needed
    // For example, to find by center name:
    // List<VaccinationCenter> findByCenterName(String centerName);

}
