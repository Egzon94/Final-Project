package com.activity.finalprojecttradingjournal.Service;


import com.activity.finalprojecttradingjournal.Model.Crypto;
import com.activity.finalprojecttradingjournal.Repository.CryptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CryptoService {

    @Autowired
    private CryptoRepository cryptoRepository;

    public List<Crypto> getAllCrypto() {
        return cryptoRepository.findAll();
    }

    public Crypto saveCrypto(Crypto crypto) {
        return cryptoRepository.save(crypto);

    }

    public Crypto updateCrypto(Long id, Crypto cryptoDetails) {
        Optional<Crypto> optionalCrypto = cryptoRepository.findById(id);
        if (optionalCrypto.isPresent()) {
            Crypto crypto = optionalCrypto.get();
            crypto.setName(cryptoDetails.getName());
            crypto.setWalletAdress(cryptoDetails.getWalletAdress());
            return cryptoRepository.save(crypto);
        } else {
            throw new RuntimeException("Crypto not found with id " + id);
        }
    }
    public void deleteCrypto(Long id) {
        cryptoRepository.deleteById(id);
    }
}
