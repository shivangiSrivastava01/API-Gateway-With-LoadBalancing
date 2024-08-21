package com.demo.serviceA.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@Slf4j
public class ServiceAController {

    @GetMapping("/v1/callServiceA")
    public String serviceA() {
        log.info("callServiceA");
        return "Response from Service A";
    }
}
