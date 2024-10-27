package com.activity.finalprojecttradingjournal.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "futures")

public class Futures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contractSymbol;

    public Futures(String name, String contractSymbol) {
        this.name = name;
        this.contractSymbol = contractSymbol;
    }
}
