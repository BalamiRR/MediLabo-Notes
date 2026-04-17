package com.medilabo.microservice_notes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Note {

    @Id
    private String id;
    private String patientId;
    private String patient;
    private String note;
}
