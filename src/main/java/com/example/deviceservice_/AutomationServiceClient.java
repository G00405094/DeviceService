package com.example.deviceservice_;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "automation-service", url = "http://localhost:8081")
public interface AutomationServiceClient {
    @PostMapping("/automation")
    String someDetails(@RequestBody DeviceDetails deviceDetails);
}
