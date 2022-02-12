package ru.paraktikumbot.bot.main.botmanager.strategy;

import org.springframework.stereotype.Component;
import ru.paraktikumbot.bot.main.api.Api;
import ru.paraktikumbot.bot.main.botmanager.model.BotCommand;
import ru.paraktikumbot.bot.main.common.model.Update;
import ru.paraktikumbot.bot.main.telegramapi.helpers.BotCommandHelper;
import ru.paraktikumbot.bot.main.telegramapi.outcomedata.MessageOutcomeData;

@Component
public class StartCommand implements BotCommandStrategy {

    private final Api api;
    private final BotCommandHelper helper;

    public StartCommand(Api api,
                        BotCommandHelper helper) {
        this.api = api;
        this.helper = helper;
    }

    @Override
    public boolean apply(Update update) {
        return helper.checkCommand(BotCommand.START, update);
    }

    @Override
    public void process(Update update) {
        api.sendMessage(new MessageOutcomeData()
                .setText("Привет!")
                .setChatId(update.getMessage().getChat().getId()));
    }
}
