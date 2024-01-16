package com.example.back.office.officeLicenses.repository;

import com.example.back.office.officeLicenses.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseRepository extends JpaRepository <License, Integer> {
}
