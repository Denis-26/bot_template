package ru.paraktikumbot.bot.main.model;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ExecutorService {

    @Value("${telegram.api}")
    private String telegramApi;

    private final RestTemplate restTemplate;

    public ExecutorService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void sendMessage(Integer chat_id, String text) {
        HashMap<String, String> request = new HashMap<>();
        request.put("chat_id", chat_id.toString());
        request.put("text", text);
        ResponseEntity<String> responseSendMessage = restTemplate
                .postForEntity(telegramApi+"/sendMessage", request, String.class);
    }


}
