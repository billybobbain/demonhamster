package com.billybobbain.demonhamster.routes;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Demons extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("direct:hamster").log("hello hamster");

    }
}
