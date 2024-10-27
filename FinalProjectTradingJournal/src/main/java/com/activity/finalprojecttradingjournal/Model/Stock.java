package com.activity.finalprojecttradingjournal.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "stocks")

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String ticker;
    private String symbol;

    public Stock(String name, String ticker, String description) {
        this.name = name;
        this.ticker = ticker;
        this.symbol = symbol;
    }

}
