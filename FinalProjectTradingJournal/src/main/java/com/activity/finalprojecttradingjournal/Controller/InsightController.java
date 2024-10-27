package com.activity.finalprojecttradingjournal.Controller;


import com.activity.finalprojecttradingjournal.Model.Insight;
import com.activity.finalprojecttradingjournal.Service.InsightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insights")
public class InsightController {

    @Autowired
    private InsightService insightService;

    @GetMapping
    public List<Insight> getAllInsights() {
        return insightService.getAllInsights();
    }

    @PostMapping
    public Insight createInsight(@RequestBody Insight insight) {
        return insightService.saveInsight(insight);

    }

    @PutMapping("/{id}")
    public Insight updateInsight(@PathVariable Long id, @RequestBody Insight insight) {
        return insightService.updateInsight(id, insight);
    }
    @DeleteMapping("/{id}")
    public void deleteInsight(@PathVariable Long id) {
        insightService.deleteInsight(id);
    }
}
