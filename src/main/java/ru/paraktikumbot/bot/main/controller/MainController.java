package ru.paraktikumbot.bot.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.paraktikumbot.bot.main.model.ExecutorService;
import ru.paraktikumbot.bot.main.model.Update;

@RestController
@RequestMapping("/")
public class MainController {

    public final ExecutorService executorService;

    public MainController(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @PostMapping("/")
    public void main(@RequestBody Update update) {
        Integer chat_id = update.getMessage().getChat().getID();
        executorService.sendMessage(chat_id, "Hello, I am a bot");
    }
}
