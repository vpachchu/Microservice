package com.example.demo.service;

import com.example.demo.model.Bouquet;
import com.example.demo.repository.BouquetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BouquetImpl implements BouquetService {

    @Autowired
    BouquetRepository bouquetRepository;

    public Bouquet save(Bouquet bouquet) {

        return bouquetRepository.save(bouquet);

    }
}
