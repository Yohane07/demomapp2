package com.yohane.demo2.services;

import com.yohane.demo2.entities.Passport;
import com.yohane.demo2.repositories.PassportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassportService {

    private final PassportRepository passportRepository;

    public PassportService(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }


    public List<Passport> getAllPassport(){
        return passportRepository.findAll();
    }

    public Optional<Passport> getPassportById(Long id){
        return passportRepository.findById(id);
    }
}
