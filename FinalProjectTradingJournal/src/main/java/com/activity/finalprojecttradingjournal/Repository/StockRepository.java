package com.activity.finalprojecttradingjournal.Repository;

import com.activity.finalprojecttradingjournal.Model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
