package com.ratna.microservices.limitsservice.controllers;

import com.ratna.microservices.limitsservice.beans.Limits;
import com.ratna.microservices.limitsservice.configuration.LimitsServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private LimitsServiceConfiguration limitsServiceConfiguration;
    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(limitsServiceConfiguration.getMin(),limitsServiceConfiguration.getMax());
    }
}
