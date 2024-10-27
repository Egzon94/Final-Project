package com.activity.finalprojecttradingjournal.Repository;

import com.activity.finalprojecttradingjournal.Model.Crypto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CryptoRepository extends JpaRepository<Crypto, Long> {
}
