package org.dtlk.analyticsandrecommendationservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/health")
public class HealthController {
    @GetMapping
    public ResponseEntity<String> getHealthCheck() {
        return new ResponseEntity<>("I am working! No worries!" ,HttpStatus.ACCEPTED);
    }
}
