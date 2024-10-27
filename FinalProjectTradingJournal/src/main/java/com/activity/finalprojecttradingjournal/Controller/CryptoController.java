package com.activity.finalprojecttradingjournal.Controller;


import com.activity.finalprojecttradingjournal.Model.Crypto;
import com.activity.finalprojecttradingjournal.Service.CryptoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cryptos")
public class CryptoController {

    @Autowired
    CryptoService cryptoService;

    @GetMapping
    public List<Crypto> getAllCryptos() {
        return cryptoService.getAllCrypto();
    }


    @PostMapping
    public Crypto createCrypto(@RequestBody Crypto crypto) {
        return cryptoService.saveCrypto(crypto);
    }

    @PutMapping("/{id}")
    public Crypto updateCrypto(@PathVariable Long  id, @RequestBody Crypto crypto) {
        return cryptoService.updateCrypto(id, crypto);
    }

    @DeleteMapping("/{id}")
    public void deleteCrypto(@PathVariable Long id) {
        cryptoService.deleteCrypto(id);
    }
}
