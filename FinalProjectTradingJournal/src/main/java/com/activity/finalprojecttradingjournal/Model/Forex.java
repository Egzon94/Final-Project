package com.activity.finalprojecttradingjournal.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "forex")

public class Forex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String currencyPair;
    private String symbol;

    public Forex(String name, String currencyPair, String symbol) {
        this.name = name;
        this.currencyPair = currencyPair;
        this.symbol = symbol;
    }
}
