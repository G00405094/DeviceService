package com.example.deviceservice_;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "confirmation-service", url = "http://localhost:8080")
public interface AutomationServiceClient {
    @PostMapping("/confirm")
    String someDetails(@RequestBody DeviceDetails deviceDetails);
}
