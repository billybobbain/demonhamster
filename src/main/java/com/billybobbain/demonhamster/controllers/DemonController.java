package com.billybobbain.demonhamster.controllers;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.CamelContext;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemonController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    CamelContext camelContext;

    @Produce(uri = "direct:hamster")
    ProducerTemplate demons;

    @GetMapping("/hamster")
    public String hamster() {
        demons.sendBody("Hello");
        return "hello";
    }
}
