package com.example.demo.service.device;

import com.example.demo.model.Device;
import com.example.demo.model.Feature;
import com.example.demo.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {
    private final DeviceRepository deviceRepository;


    @Override
    public Device createDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public Device getDevice(UUID id) {
        return deviceRepository.findDeviceById(id);
    }

    @Override
    public Device addFeature(UUID id, List<Feature> features) {
        var device = deviceRepository.findDeviceById(id);
        device.setFeatures(features);
        return deviceRepository.save(device);
    }
}
