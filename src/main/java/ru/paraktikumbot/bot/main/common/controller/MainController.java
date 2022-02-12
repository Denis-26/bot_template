package ru.paraktikumbot.bot.main.common.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.paraktikumbot.bot.main.botmanager.service.BotManagerService;
import ru.paraktikumbot.bot.main.common.model.Update;

@RestController
@RequestMapping("/")
public class MainController {

    private final BotManagerService botManagerService;

    public MainController(BotManagerService botManagerService) {
        this.botManagerService = botManagerService;
    }

    @PostMapping("/")
    public void main(@RequestBody Update update) {
        botManagerService.process(update);
    }
}
