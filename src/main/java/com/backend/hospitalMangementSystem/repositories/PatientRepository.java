package com.backend.hospitalMangementSystem.repositories;

import com.backend.hospitalMangementSystem.dto.BloodGroupStats;
import com.backend.hospitalMangementSystem.dto.CPatientInfo;
import com.backend.hospitalMangementSystem.dto.IPatientInfo;
import com.backend.hospitalMangementSystem.entities.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    List<Patient> findByEmailContaining(String e);

    @Query("select  p.id as id, p.name as name, p.email as email from Patient  p")

    List<IPatientInfo>getAllPatientInfo();
    @Query("select new com.backend.hospitalMangementSystem.dto.CPatientInfo(p.id,p.name) "+ "from  Patient p")
    List<CPatientInfo> getAllPatientInfoConcrete();

    @Query("select  new com.backend.hospitalMangementSystem.dto.BloodGroupStats(p.bloodGroup,"+"COUNT(p)) from Patient p group by p.bloodGroup order by COUNT (p)")

    List<BloodGroupStats>getBloodGroupStats();

    @Transactional
    @Modifying
    @Query("update Patient p set p.name = :name where p.id  =:id")
    int updatePatientNameWithId(@Param("name")String name, @Param("id") Long id);

}
