package com.backend.hospitalMangementSystem.services;


import com.backend.hospitalMangementSystem.entities.Patient;
import com.backend.hospitalMangementSystem.repositories.PatientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServices {

    private final PatientRepository patientRepository;

    @Transactional
    public void testPatientTransaction(){
        Patient p1 = patientRepository.findById(1L).orElseThrow();
        Patient p2 = patientRepository.findById(1L).orElseThrow();

        System.out.println(p1==p2);
    }
}
