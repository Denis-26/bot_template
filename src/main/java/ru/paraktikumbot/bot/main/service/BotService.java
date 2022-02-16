package ru.paraktikumbot.bot.main.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.HashMap;
import java.util.Map;

@Service
public class BotService {

    @Value("${telegram.api}")
    private String telegramApi;

    private final RestTemplate restTemplate;

    public BotService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendMessage(Integer chatId, String textToSend) {

        Map<String, String> request = new HashMap<>();
        request.put("chat_id", String.valueOf(chatId));
        request.put("text", textToSend);

        ResponseEntity<String> sendMessage = restTemplate
                .postForEntity(telegramApi + "/sendMessage", request, String.class);
        System.out.println("Body + " + sendMessage.getBody());
    }

}
