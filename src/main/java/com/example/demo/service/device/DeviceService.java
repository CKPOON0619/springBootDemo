package com.example.demo.service.device;

import com.example.demo.model.Device;
import com.example.demo.model.Feature;
import com.example.demo.model.Person;

import java.util.List;
import java.util.UUID;

public interface DeviceService {
    Device createDevice(Device device);
    Device getDevice(UUID id);

    Device addFeature(UUID id, List<Feature> features);
}
