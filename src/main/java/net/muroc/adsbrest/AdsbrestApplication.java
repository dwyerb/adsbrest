package net.muroc.adsbrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AdsbrestApplication
{
    public static void main(String[] args) {
        SpringApplication.run(AdsbrestApplication.class, args);
    }
}
