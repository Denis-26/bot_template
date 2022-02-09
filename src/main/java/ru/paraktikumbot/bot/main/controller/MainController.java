package ru.paraktikumbot.bot.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.paraktikumbot.bot.main.ResponseService;
import ru.paraktikumbot.bot.main.model.Update;

@RestController
@RequestMapping("/")
public class MainController {
    private final ResponseService responseService;

    public MainController(ResponseService responseService){
        this.responseService = responseService;
    }

    @PostMapping("/")
    public void main(@RequestBody Update update) {
        System.out.println(update.getUpdateId());

        Integer chat_id = update.getMessage().getChat().getId();

        responseService.sendMessage(chat_id, "Hello, a am bot");
    }
}
