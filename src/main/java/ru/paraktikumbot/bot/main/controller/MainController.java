package ru.paraktikumbot.bot.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.paraktikumbot.bot.main.model.Update;
import ru.paraktikumbot.bot.main.service.BotService;

@RestController
@RequestMapping("/")
public class MainController {

    private final BotService botService;

    public MainController(BotService botService) {
        this.botService = botService;
    }

    @PostMapping("/")
    public void main(@RequestBody Update update) {

        Integer chatId = update.getMessage().getChat().getChatId();
        botService.sendMessage(chatId, "Hello, i am bot");

    }
}
