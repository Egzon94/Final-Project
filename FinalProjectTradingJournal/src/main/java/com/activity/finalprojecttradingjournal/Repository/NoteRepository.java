package com.activity.finalprojecttradingjournal.Repository;

import com.activity.finalprojecttradingjournal.Model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
