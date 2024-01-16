package com.example.back.office.idneoLicences.controller;

import com.example.back.office.idneoLicences.entity.UserActive;
import com.example.back.office.idneoLicences.service.UserActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/users-active")
public class UserActiveController {
    @Autowired
    private UserActiveService userActiveService;

    @GetMapping
    public List<UserActive> getUsersActives(){
       return userActiveService.getUsers();
    }
    @GetMapping("/{licenceName}")
    public List<UserActive>getUsersByLicence(@PathVariable("licenceName") String licenceName){
        return userActiveService.findUsersByLicense(licenceName);
    }
}
