package com.pisarevdmitrii.medicineclinicapp.core.repository.impl;

import com.pisarevdmitrii.medicineclinicapp.core.model.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientEntityRepository extends JpaRepository<PatientEntity, Long> {
}
