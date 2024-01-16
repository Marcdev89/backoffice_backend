package com.example.back.office.idneoLicences.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "LicencesUsage")
public class LicencesUsage {

    @Id
    @Column(name = "LicenseName")
    private String name;
    @Column(name = "UsersCapacity")
    private Integer capacity;
    @Column(name = "LicenseFamily")
    private String family;
    @Column(name = "CurrentDate")
    private LocalDateTime date;
    @Column(name = "CurrentUsers")
    private Integer users;

}
