package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.Forex;
import com.activity.finalprojecttradingjournal.Repository.ForexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForexService {

    @Autowired
    private ForexRepository forexRepository;

    public List<Forex> getAllForex() {
        return forexRepository.findAll();
    }
    public Forex saveForex(Forex forex) {
        return forexRepository.save(forex);

    }
    public Forex updateForex(Long id, Forex forexDetails) {
        Optional<Forex> optionalForex = forexRepository.findById(id);
        if (optionalForex.isPresent()) {
            Forex forex = optionalForex.get();
            forex.setName(forexDetails.getName());
            forex.setCurrencyPair(forexDetails.getCurrencyPair());
            forex.setSymbol(forexDetails.getSymbol());
            return forexRepository.save(forex);
        } else {
            throw new RuntimeException("Forex not found with id " + id);
        }
    }

    public void deleteForex(Long id) {
        forexRepository.deleteById(id);

    }
}
