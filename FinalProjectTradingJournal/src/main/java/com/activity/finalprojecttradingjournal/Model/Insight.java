package com.activity.finalprojecttradingjournal.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "insights")
public class Insight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String activity;

    @ManyToOne
    private JournalEntry journalEntry;

    public Insight(String activity, JournalEntry journalEntry) {
        this.activity = activity;
        this.journalEntry = journalEntry;
    }
}
