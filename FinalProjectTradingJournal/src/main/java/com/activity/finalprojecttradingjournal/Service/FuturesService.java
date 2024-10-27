package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.Futures;
import com.activity.finalprojecttradingjournal.Repository.FuturesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuturesService {

    @Autowired
    private FuturesRepository futuresRepository;

    public List<Futures> getAllFutures() {
        return futuresRepository.findAll();
    }

    public Futures saveFutures(Futures futures) {
        return futuresRepository.save(futures);
    }

    public Futures updateFutures(Long id, Futures futuresDetails) {
        Optional<Futures> optionalFutures = futuresRepository.findById(id);
        if (optionalFutures.isPresent()) {
            Futures futures = optionalFutures.get();
            futures.setName(futuresDetails.getName());
            futures.setContractSymbol(futuresDetails.getContractSymbol());
        } else {
            throw new RuntimeException("Futures with id " + id + " not found");

        }
        return futuresDetails;
    }
        public void deleteFutures (Long id){
            futuresRepository.deleteById(id);
        }



}