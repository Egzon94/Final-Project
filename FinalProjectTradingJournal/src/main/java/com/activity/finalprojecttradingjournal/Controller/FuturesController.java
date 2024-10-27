package com.activity.finalprojecttradingjournal.Controller;


import com.activity.finalprojecttradingjournal.Model.Futures;
import com.activity.finalprojecttradingjournal.Service.FuturesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/futures")
public class FuturesController {

    @Autowired
    private FuturesService futuresService;

    @GetMapping
    public List<Futures> getAllFutures(){
        return futuresService.getAllFutures();
    }

    @PostMapping
    public Futures createFutures(@RequestBody Futures futures){
        return futuresService.saveFutures(futures);
    }

    @PutMapping("/{id}")
    public Futures updateFutures(@RequestBody Futures futures, @PathVariable Long  id){
        return futuresService.updateFutures(id, futures);
    }
    @DeleteMapping("/{id}")
    public void deleteFutures(@PathVariable Long id){
        futuresService.deleteFutures(id);
    }
}
