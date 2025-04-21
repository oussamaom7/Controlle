package com.example.demo.repostories;

import com.example.demo.entities.Campagne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CampagneRepository extends JpaRepository<Campagne, Integer> {
    LocalDate today = LocalDate.now();
    List<Campagne> findByCampagne(Campagne campagne);

    }
