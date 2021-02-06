package com.example.telegram_bot.processor;

import org.springframework.context.annotation.Configuration;

@Configuration
public class NoneProcessor implements Processor{

    @Override
    public String run() {

        return "Nothing you can set now, sorry...";

    }
}
