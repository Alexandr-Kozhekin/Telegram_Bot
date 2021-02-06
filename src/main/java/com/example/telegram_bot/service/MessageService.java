package com.example.telegram_bot.service;

import com.example.telegram_bot.bot.TelegramBotApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class MessageService {

    @Autowired
    TelegramBotApplication telegramBotApplication;

    public void sendMessage(Message message, String text) {
        SendMessage sendMessage = new SendMessage();

        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);

        try {

            telegramBotApplication.execute(sendMessage);

        }

        catch (TelegramApiException e) {

            e.printStackTrace();

        }
    }

}
