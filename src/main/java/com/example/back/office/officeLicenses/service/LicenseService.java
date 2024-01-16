package com.example.back.office.officeLicenses.service;

import com.example.back.office.officeLicenses.entity.License;
import com.example.back.office.officeLicenses.repository.LicenseRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicenseService {
    @Autowired
    LicenseRepository licenseRepository;
    public List<License> getLicense(){
        return  licenseRepository.findAll();
    }
    public License getLicenseById(Integer id){
        return licenseRepository.findById(id).orElse(null);
    }
    public License save(License license){
        return licenseRepository.save(license);
    }
    public License updateLicense(License license, Integer id){
        License updated = licenseRepository.getReferenceById(id);
        updated.setCapacity(license.getCapacity());
        updated.setFull(license.getFull());
        updated.setProject(license.getProject());
        updated.setPassword(license.getPassword());
        updated.setName(license.getName());
        return save(updated);
    }
    public void deleteById(Integer id){
        licenseRepository.deleteById(id);
    }
}
