package com.yohane.demo2.services;


import com.yohane.demo2.entities.Bagage;
import com.yohane.demo2.repositories.BagageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BagageService {

    private final BagageRepository bagageRepository;

    public BagageService(BagageRepository bagageRepository) {
        this.bagageRepository = bagageRepository;
    }


    public List<Bagage> getAllBagages(){
        return bagageRepository.findAll();
    }

    public Optional<Bagage> getBagageById(Long id){
        return bagageRepository.findById(id);
    }
}
