package com.activity.finalprojecttradingjournal.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "crypto")
public class Crypto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String walletAdress;

    public Crypto(String name, String walletAdress) {
        this.name = name;
        this.walletAdress = walletAdress;
    }
}
