package org.example.veterinaria2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Veterinaria2024Application {

    public static void main(String[] args) {
        SpringApplication.run(
                Veterinaria2024Application.class,
                args);
        System.out.println("DB_URL: " + System.getenv("DB_URL"));
        System.out.println("DB_USERNAME: " + System.getenv("DB_USERNAME"));
        System.out.println("DB_PASSWORD: " + System.getenv("DB_PASSWORD"));
        System.out.println("DB_PLATFORM: " + System.getenv("DB_PLATFORM"));

    }

}
