package com.backend.hospitalMangementSystem.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(nullable  = false, length = 100)
    private String name;

    @Column(length = 100)
    private String specialization;

    @Column(nullable = false, unique = true,length = 100)
    private String email;

    // bidirectional mapping
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments= new ArrayList<>();


}
