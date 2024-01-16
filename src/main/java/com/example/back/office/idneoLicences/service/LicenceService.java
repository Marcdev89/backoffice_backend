package com.example.back.office.idneoLicences.service;

import com.example.back.office.idneoLicences.entity.LicencesUsage;
import com.example.back.office.idneoLicences.repository.LicenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenceService {
    @Autowired
    LicenceRepository licenceRepository;

    public List <LicencesUsage> getLicense(){
        return  licenceRepository.findAll();
    }

}

