package com.example.back.office.idneoLicences.controller;

import com.example.back.office.idneoLicences.entity.LicencesUsage;
import com.example.back.office.idneoLicences.service.LicenceService;
import com.example.back.office.officeLicenses.entity.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/licence")
public class LicenceController {
    @Autowired
    private LicenceService licenceService;
    @GetMapping
    public List<LicencesUsage> getAll(){
        return licenceService.getLicense();
    }

}
