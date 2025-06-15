package com.dhiraj.VaccinationCentre.Controller;

import com.dhiraj.VaccinationCentre.Entity.VaccinationCenter;
import com.dhiraj.VaccinationCentre.Repository.VaccinationCenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/vaccinationcenter")
public class VaccinationCenterController {
    @Autowired
    private VaccinationCenterRepo vaccinationCenterRepo;
    // Add methods to handle requests related to vaccination centers
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/all")
    public ResponseEntity<List<VaccinationCenter>> getAllVaccinationCenters() {
        List<VaccinationCenter> centers = vaccinationCenterRepo.findAll();
        if (centers.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(centers);
    }

    @PostMapping("/add")
    public ResponseEntity<VaccinationCenter> addVaccinationCenter(@RequestBody VaccinationCenter center) {
        VaccinationCenter savedCenter = vaccinationCenterRepo.save(center);
        return ResponseEntity.ok(savedCenter);
    }
}
