package ru.paraktikumbot.bot.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.paraktikumbot.bot.main.model.Message;
import ru.paraktikumbot.bot.main.model.Message2Telegram;

import java.util.HashMap;

@Service
public class ResponseService {

    private final RestTemplate restTemplate;

    public ResponseService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${telegram.api}")
    private String telegramApi;

    @Value("${webhook.url}")
    private String webhookUrl;

    public void sendMessage(Integer chatId, String text){
        Message2Telegram message = new Message2Telegram(chatId, text);
        HashMap<String, String> map = new HashMap<>();
        map.put("chat_id", chatId.toString());
        map.put("text", text);

        //можно было бы вместо map закинуть экземпляр message, в котором как раз всего 2 поля с нужными названиями и типами
        ResponseEntity<Object> responseText = restTemplate
                .postForEntity(telegramApi+"/sendmessage", map, Object.class);
    }
}
