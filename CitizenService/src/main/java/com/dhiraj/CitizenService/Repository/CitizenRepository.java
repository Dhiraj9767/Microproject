package com.dhiraj.CitizenService.Repository;

import com.dhiraj.CitizenService.Entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
    // Additional query methods can be defined here if needed
    public List<Citizen> findByVaccinationCenterId(int id);
}
