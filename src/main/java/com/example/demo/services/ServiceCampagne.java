package com.example.demo.services;

import com.example.demo.entities.Campagne;
import com.example.demo.repostories.CampagneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class ServiceCampagne {

    @Autowired
    private CampagneRepository campagneRepository;

    public List<Campagne> getActiveCampagnes() {
        LocalDate today = LocalDate.now();
        return campagneRepository.findAll();
        return campagneRepository.findByDateDebutLessThanEqualAndDateFinGreaterThanEqual(today, today);
    } ;


}