package com.pablo.controllers;

import com.pablo.entity.City;
import com.pablo.repo.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CityController {
    @Autowired
    CityRepository cityRepository;

    @GetMapping(value = "/city/{id}")
    public City getById(@PathVariable(value = "id") Long id) {
        return cityRepository.getCityById(id);
    }
}
