package com.activity.finalprojecttradingjournal.Repository;

import com.activity.finalprojecttradingjournal.Model.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalEntryRepository extends JpaRepository<JournalEntry, Long> {
}
