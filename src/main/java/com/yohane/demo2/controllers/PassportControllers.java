package com.yohane.demo2.controllers;

import com.yohane.demo2.entities.Passport;
import com.yohane.demo2.services.PassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/passports")
public class PassportControllers {

    private final PassportService passportService;

    @Autowired
    public PassportControllers(PassportService passportService){
        this.passportService = passportService;
    }
    @GetMapping("{id}")
    public Optional<Passport> getPassport(@PathVariable Long id){
        return passportService.getPassportById(id);
    }

    @GetMapping
    public List<Passport> getAllPassport(){
        return passportService.getAllPassport();
    }

}
