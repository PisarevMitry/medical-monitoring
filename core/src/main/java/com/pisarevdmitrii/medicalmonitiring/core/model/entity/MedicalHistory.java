package com.pisarevdmitrii.medicalmonitiring.core.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "medical_histories")
@AllArgsConstructor
@NoArgsConstructor
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @Column(name = "doc_number")
    private String docNumber;

    @CreationTimestamp
    @Column(name = "create_dttm")
    private LocalDateTime createDttm;

    @UpdateTimestamp
    @Column(name = "modify_dttm")
    private LocalDateTime modifyDttm;

    @Column(name = "doctor_id")
    private String doctor;

    @Column(name = "diagnosis")
    private String diagnosis;

    @OneToOne
    private MedicalHistory medicalHistory;
}