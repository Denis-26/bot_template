package ru.paraktikumbot.bot.main.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.paraktikumbot.bot.main.model.Update;

@RestController
@RequestMapping("/")
public class MainController {

    @PostMapping("/")
    public void main(@RequestBody Update update) {
        System.out.println(update.getMessage().getText());
    }
}
