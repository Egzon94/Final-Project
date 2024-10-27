package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.Note;
import com.activity.finalprojecttradingjournal.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class NoteService {

    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public Note updateNote(Long id, Note noteDetails) {
        noteDetails.setId(id);  // set the ID for update
        return noteRepository.save(noteDetails);
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}


