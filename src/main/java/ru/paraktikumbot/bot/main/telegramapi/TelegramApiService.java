package ru.paraktikumbot.bot.main.telegramapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.paraktikumbot.bot.main.api.Api;
import ru.paraktikumbot.bot.main.telegramapi.incomedata.Message;
import ru.paraktikumbot.bot.main.telegramapi.outcomedata.MessageOutcomeData;

@Service
public class TelegramApiService implements Api {

    @Value("${telegram.api}")
    private String telegramApi;

    private final RestTemplate restTemplate;

    public TelegramApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void sendMessage(MessageOutcomeData message) {
        restTemplate.postForEntity(telegramApi + "/sendMessage", message, Message.class);
    }
}
