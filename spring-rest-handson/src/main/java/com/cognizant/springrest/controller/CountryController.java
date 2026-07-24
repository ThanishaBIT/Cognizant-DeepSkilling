package com.cognizant.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.cognizant.springrest.model.Country;
import com.cognizant.springrest.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

   
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}