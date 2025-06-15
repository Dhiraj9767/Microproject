package com.dhiraj.CitizenService.Controller;

import com.dhiraj.CitizenService.Entity.Citizen;
import com.dhiraj.CitizenService.Repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
    @Autowired
    private CitizenRepository citizenRepository;


    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Controller working fine.");
    }

    @GetMapping("/id/{centerId}")
    public List<Citizen> getCitizensByCenterId(@PathVariable int centerId) {
        return citizenRepository.findByVaccinationCenterId(centerId);
    }

    @PostMapping("/add")
    public ResponseEntity<Citizen> addCitizen(@RequestBody Citizen newCitizen) {
        Citizen citizen = citizenRepository.save(newCitizen);
        return new ResponseEntity<>(citizen, HttpStatus.CREATED);
    }

}
