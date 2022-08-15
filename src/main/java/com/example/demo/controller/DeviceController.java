package com.example.demo.controller;

import com.example.demo.model.Device;
import com.example.demo.model.Feature;
import com.example.demo.model.Person;
import com.example.demo.service.device.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path="/api/device")
@RequiredArgsConstructor
public class DeviceController {

    private final DeviceService service;

    @PostMapping(path="/save")
    public Device createDevice(@RequestBody Device device) {
        return service.createDevice(device);
    }

    @GetMapping(path="/{deviceId}")
    public  Device getDevice(@PathVariable("deviceId") UUID id) {
        return service.getDevice(id);
    }

    @PostMapping(path="/{deviceId}/addFeature")
    public  Device addFeature(@PathVariable("deviceId") UUID id, @RequestBody List<Feature> features) {
        return service.addFeature(id, features);
    }
}
