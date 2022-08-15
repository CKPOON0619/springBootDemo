package com.example.demo.service.feature;


import com.example.demo.model.Feature;
import com.example.demo.repository.FeatureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FeatureServiceImpl implements FeatureService {
    private final FeatureRepository repository;

    @Override
    public Feature createFeature(Feature feature) {
        return repository.save(feature);
    }
}
