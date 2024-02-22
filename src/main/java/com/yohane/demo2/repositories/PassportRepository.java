package com.yohane.demo2.repositories;

import com.yohane.demo2.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Long> {
}
