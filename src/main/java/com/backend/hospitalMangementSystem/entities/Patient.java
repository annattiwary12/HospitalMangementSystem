package com.backend.hospitalMangementSystem.entities;


import com.backend.hospitalMangementSystem.entities.types.BloodGroupType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private LocalDate birthDate;
    private String email;

    private String gender;


    @Enumerated(value  =EnumType.STRING)
    private BloodGroupType bloodGroup;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne

    @JoinColumn(name  = "Patient_insurance", unique = true)
    private   Insurance insurance;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointmentList = new ArrayList<>();

}
