package com.medilabo.microservice_notes.repository;

import com.medilabo.microservice_notes.model.Note;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
public interface PatientNoteRepository extends MongoRepository<Note, String> {
    List<Note> findByPatientId(int id);
}
