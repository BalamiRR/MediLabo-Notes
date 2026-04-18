package com.medilabo.microservice_notes.service;

import com.medilabo.microservice_notes.model.Note;
import com.medilabo.microservice_notes.repository.PatientNoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientNoteService {

    @Autowired
    private PatientNoteRepository noteRepository;

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public List<Note> getNotesByPatientId(int id) {
        return noteRepository.findByPatientId(id);
    }

    public Note createNote(Note patientNote) {
        patientNote.setId(null);
        return noteRepository.save(patientNote);
    }

    public void deleteAllNotes(){
        noteRepository.deleteAll();
    }
}