package com.example.back.office.officeLicenses.repository;

import com.example.back.office.officeLicenses.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
