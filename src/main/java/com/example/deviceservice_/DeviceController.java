package com.example.deviceservice_;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {
    private final AutomationServiceClient automationServiceClient;

    @Autowired
    public DeviceController(AutomationServiceClient automationServiceClient) {
        this.automationServiceClient = automationServiceClient;
    }

    @PostMapping("/create-device")
    public String createDevice(@RequestBody DeviceDetails deviceDetails) {
        String confirmation = automationServiceClient.someDetails(deviceDetails);
        return "Device created: " + confirmation + " ID: " + deviceDetails.getDeviceId();
    }
}
