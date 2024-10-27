package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.JournalEntry;
import com.activity.finalprojecttradingjournal.Repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public List<JournalEntry> getAllEntries() {
        return journalEntryRepository.findAll();
    }

    public JournalEntry saveEntry(JournalEntry entry) {
        return journalEntryRepository.save(entry);
    }

    public JournalEntry updateEntry(Long id, JournalEntry entryDetails) {
        entryDetails.setId(id);  // set the ID for update
        return journalEntryRepository.save(entryDetails);
    }

    public void deleteEntry(Long id) {
        journalEntryRepository.deleteById(id);
    }
}