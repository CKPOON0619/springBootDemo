package com.example.demo.controller;

import com.example.demo.model.Feature;
import com.example.demo.service.feature.FeatureService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/feature")
@RequiredArgsConstructor
public class FeatureController {

    private final FeatureService service;

    @PostMapping(path="/save")
    public Feature addFeature(@RequestBody Feature Feature) {
        return service.createFeature(Feature);
    }
}
