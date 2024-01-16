package com.example.back.office.idneoLicences.repository;

import com.example.back.office.idneoLicences.entity.UserActive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserActiveRepository extends JpaRepository<UserActive, Integer> {

    List<UserActive> findByLicense(String licenseName);


}
