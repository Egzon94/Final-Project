package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.Insight;
import com.activity.finalprojecttradingjournal.Repository.InsightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsightService {


    @Autowired
    private InsightRepository insightRepository;

    public List<Insight> getAllInsights() {
        return insightRepository.findAll();
    }

    public Insight saveInsight(Insight insight) {
        return insightRepository.save(insight);
    }

    public Insight updateInsight(Long id, Insight insightDetails) {
        insightDetails.setId(id);  // set the ID for update
        return insightRepository.save(insightDetails);
    }

    public void deleteInsight(Long id) {
        insightRepository.deleteById(id);
    }
}
