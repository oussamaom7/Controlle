package com.example.demo.repostories;

import com.example.demo.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Integer> {
    List<Donation> findByDonateur(String nomDonateur);
    List<Donation> findByDateAndDonateur(LocalDate date, String nomDonateur);
}
