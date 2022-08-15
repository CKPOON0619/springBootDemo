package com.example.demo.repository;

import com.example.demo.model.Device;
import com.example.demo.model.Feature;
import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DeviceRepository extends JpaRepository<Device, UUID> {
    Device findDeviceById(UUID id);
    List<Device> findByIdIn(List<UUID> ids);
}
