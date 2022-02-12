package ru.paraktikumbot.bot.main.botmanager.service;

import org.springframework.stereotype.Service;
import ru.paraktikumbot.bot.main.botmanager.strategy.BotCommandContext;
import ru.paraktikumbot.bot.main.common.model.Update;

@Service
public class BotManagerService {

    private final BotCommandContext context;

    public BotManagerService(BotCommandContext context) {
        this.context = context;
    }

    public void process(Update update) {
        context.process(update);
    }

}
