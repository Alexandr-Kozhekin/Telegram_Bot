package com.example.telegram_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class JavaquestionsbotApplication {

    public static void main(String[] args) {

        ApiContextInitializer.init();
        SpringApplication.run(JavaquestionsbotApplication.class, args);

    }
}
