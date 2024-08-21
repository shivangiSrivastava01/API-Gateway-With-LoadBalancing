package com.demo.serviceB.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ServiceBController {

    @GetMapping("/v1/callServiceB")
    public String serviceB(){
        log.info("callServiceB");
        return "Return from serviceB";
    }
}
