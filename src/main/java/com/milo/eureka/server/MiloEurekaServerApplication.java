package com.milo.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MiloEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiloEurekaServerApplication.class, args);
    }

}
