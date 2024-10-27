package com.activity.finalprojecttradingjournal.Controller;


import com.activity.finalprojecttradingjournal.Model.JournalEntry;
import com.activity.finalprojecttradingjournal.Service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal_entry")
public class JournalEntryController {
    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAllJournalEntries() {
        return journalEntryService.getAllEntries();
    }

    @PostMapping
    public JournalEntry createJournalEntry(@RequestBody JournalEntry journalEntry) {
        return journalEntryService.saveEntry(journalEntry);
    }

    @PutMapping("/{id}")
    public JournalEntry updateJournalEntry(@PathVariable Long id, @RequestBody JournalEntry journalEntryDetails) {
        return journalEntryService.updateEntry(id, journalEntryDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteJournalEntry(@PathVariable Long id) {
        journalEntryService.deleteEntry(id);
    }
}