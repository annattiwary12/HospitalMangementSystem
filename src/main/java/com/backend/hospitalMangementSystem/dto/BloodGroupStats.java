package com.backend.hospitalMangementSystem.dto;

import com.backend.hospitalMangementSystem.entities.types.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {

    private final BloodGroupType bloodGroupType;
    private final long count;


}
