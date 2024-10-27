package com.activity.finalprojecttradingjournal.Controller;


import com.activity.finalprojecttradingjournal.Model.Forex;
import com.activity.finalprojecttradingjournal.Model.Stock;
import com.activity.finalprojecttradingjournal.Service.ForexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/forex")
public class ForexController {

    @Autowired
    private ForexService forexService;

    @GetMapping
    public List<Forex> getAllForex() {
        return forexService.getAllForex();
    }

    @PostMapping
    public Forex createForex(@RequestBody Forex forex) {
        return forexService.saveForex(forex);

    }

    @PutMapping("/{id}")
    public Forex updateForex(@PathVariable Long id, @RequestBody Forex forex) {
        return forexService.updateForex(id, forex);
    }

    @DeleteMapping("/{id}")
    public void deleteForex(@PathVariable Long id) {
        forexService.deleteForex(id);
    }
}
