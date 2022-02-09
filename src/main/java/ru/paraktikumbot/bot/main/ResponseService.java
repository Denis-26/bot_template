package ru.paraktikumbot.bot.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.paraktikumbot.bot.main.model.Message;

@Service
public class ResponseService {

    private final RestTemplate restTemplate;
    private final ResponseService responseService;

    public ResponseService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Integer chat_id;
    private String text;

    @Value("${telegram.api}")
    private String telegramApi;

    @Value("${webhook.url}")
    private String webhookUrl;

    public void sendMessage(Integer chat_id, String text){
        responseService.setChat_id(chat_id);
        responseService.setText(text);

        ResponseEntity<Object> responseText = restTemplate
                .postForEntity(telegramApi+"/sendmessage", responseService, Object.class);
    }

    public Integer getChat_id(){
        return chat_id;
    }
    public String getText(){
        return getText();
    }

    public void setChat_id(Integer chat_id){
        this.chat_id = chat_id;
    }
    public void setText(String text){
        this.text = text;
    }
}
