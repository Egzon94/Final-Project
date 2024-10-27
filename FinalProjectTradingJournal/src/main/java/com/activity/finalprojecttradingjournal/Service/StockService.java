package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.Stock;
import com.activity.finalprojecttradingjournal.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStock(){
        return stockRepository.findAll();
    }

    public Stock saveStock(Stock stock){
        return stockRepository.save(stock);
    }

    public Stock updateStock(Long id, Stock stockDetails) {
        Optional<Stock> optionalStock = stockRepository.findById(id);
        if (optionalStock.isPresent()) {
            Stock stock = optionalStock.get();
            stock.setName(stockDetails.getName());
            stock.setTicker(stockDetails.getTicker());
            stock.setSymbol(stockDetails.getSymbol());
            return stockRepository.save(stock);
        } else {
            throw new RuntimeException("stock not found " + id);
        }
    }

    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }


}
