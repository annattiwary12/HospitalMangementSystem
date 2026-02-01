package com.backend.hospitalMangementSystem;

import com.backend.hospitalMangementSystem.dto.BloodGroupStats;
import com.backend.hospitalMangementSystem.dto.CPatientInfo;
import com.backend.hospitalMangementSystem.dto.IPatientInfo;
import com.backend.hospitalMangementSystem.entities.Patient;
import com.backend.hospitalMangementSystem.repositories.PatientRepository;
import com.backend.hospitalMangementSystem.services.PatientServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientServices patientServices;

    @Test
    public void testPatient(){
        List<Patient> patientList = patientRepository.findAll();
        List<IPatientInfo> patientInfoList = patientRepository.getAllPatientInfo(); // this list is read only we can not modify data as the proxy class will create of the interface , their is no any concrete class
       List<CPatientInfo> cPatientInfos = patientRepository.getAllPatientInfoConcrete();  // here is concrete class and we can do whatever we want
      List<BloodGroupStats> bloodGroupStatsList = patientRepository.getBloodGroupStats();
       for(BloodGroupStats p:bloodGroupStatsList){
           System.out.println(p.getId() + " " + p.getName() + " " + p.getEmail());
          System.out.println(p);
      }

       int rowsAffected = patientRepository.updatePatientNameWithId("Anant" , 1L);
      System.out.println(rowsAffected);

        patientServices.testPatientTransaction();

    }






}
