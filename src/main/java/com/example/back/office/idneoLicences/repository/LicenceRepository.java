package com.example.back.office.idneoLicences.repository;

import com.example.back.office.idneoLicences.entity.LicencesUsage;
import com.example.back.office.officeLicenses.entity.License;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenceRepository extends JpaRepository <LicencesUsage, String> {
}
