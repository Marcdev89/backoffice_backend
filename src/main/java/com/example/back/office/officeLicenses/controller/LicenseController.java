package com.example.back.office.officeLicenses.controller;

import com.example.back.office.officeLicenses.entity.License;
import com.example.back.office.officeLicenses.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/license")
public class LicenseController {
    @Autowired
    private LicenseService licenseService;
   // @Autowired
   // private UserService userService;

    @GetMapping("/{id}")
    public License getById(@PathVariable Integer id){
        return licenseService.getLicenseById(id);
    }
    @PostMapping("/save")
    public License create(@RequestBody License license){
        return licenseService.save(license);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        licenseService.deleteById(id);
    }
    @PutMapping("/{id}")
    public License update(@RequestBody License license, @PathVariable Integer id){
        return licenseService.updateLicense(license, id);
    }

}
