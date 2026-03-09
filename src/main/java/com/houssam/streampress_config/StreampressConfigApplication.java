package com.houssam.streampress_config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class StreampressConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(StreampressConfigApplication.class, args);
    }
}
