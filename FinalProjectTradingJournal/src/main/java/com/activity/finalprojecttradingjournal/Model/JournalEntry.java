package com.activity.finalprojecttradingjournal.Model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "journal_entry")
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private LocalDate entryDate;
    private LocalDate exitDate;
    private Integer quantity;
    private Double price;

    @ManyToOne
    private Stock stock;

    @ManyToOne
    private Forex forex;

    @ManyToOne
    private Crypto crypto;

    @ManyToOne
    private Futures futres;

    public JournalEntry(LocalDate entryDate, LocalDate exitDate, Integer quantity, Double price, Stock stock, Forex forex, Crypto crypto, Futures futres) {
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.quantity = quantity;
        this.price = price;
        this.stock = stock;
        this.forex = forex;
        this.crypto = crypto;
        this.futres = futres;
    }
}
