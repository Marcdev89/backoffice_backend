package com.example.back.office.idneoLicences.service;

import com.example.back.office.idneoLicences.entity.UserActive;
import com.example.back.office.idneoLicences.repository.UserActiveRepository;
import com.example.back.office.officeLicenses.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActiveService {
    @Autowired
    private UserActiveRepository userActiveRepository;

    public List<UserActive> getUsers(){
        return userActiveRepository.findAll();
    }
    public List <UserActive> findUsersByLicense(String licenseName){
        return userActiveRepository.findByLicense(licenseName);
    }
}
