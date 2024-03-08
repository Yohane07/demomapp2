package com.yohane.demo2.controllers;

import com.yohane.demo2.entities.Bagage;
import com.yohane.demo2.services.BagageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bagage")
public class BagageControllers {

    private final BagageService bagageService;

    @Autowired
    public BagageControllers(BagageService bagageService){
        this.bagageService = bagageService;
    }
    @GetMapping("{id}")
    public Optional<Bagage> getBagage(@PathVariable Long id){
        return bagageService.getBagageById(id);
    }

    @GetMapping
    public List<Bagage> getAllBagages(){
        return bagageService.getAllBagages();
    }

}
