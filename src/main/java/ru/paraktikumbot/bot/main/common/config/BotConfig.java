package ru.paraktikumbot.bot.main.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.paraktikumbot.bot.main.common.model.WebHook;

import javax.annotation.PostConstruct;

@Configuration
public class BotConfig {

    @Value("${telegram.api}")
    private String telegramApi;

    @Value("${webhook.url}")
    private String webhookUrl;

    private final RestTemplate restTemplate;

    public BotConfig(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostConstruct
    void init() {
        WebHook webHook = new WebHook().setUrl(webhookUrl);
        ResponseEntity<Object> responseDeleteWebhook = restTemplate
                .postForEntity(telegramApi+"/deleteWebhook", webHook, Object.class);
        ResponseEntity<Object> responseSetWebhook = restTemplate
                .postForEntity(telegramApi+"/setWebhook", webHook, Object.class);

        System.out.println(responseDeleteWebhook.getBody());
        System.out.println(responseSetWebhook.getBody());
    }

}
