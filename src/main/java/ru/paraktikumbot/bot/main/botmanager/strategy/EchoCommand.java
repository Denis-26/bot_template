package ru.paraktikumbot.bot.main.botmanager.strategy;

import org.springframework.stereotype.Component;
import ru.paraktikumbot.bot.main.api.Api;
import ru.paraktikumbot.bot.main.botmanager.model.BotCommand;
import ru.paraktikumbot.bot.main.common.model.Update;
import ru.paraktikumbot.bot.main.telegramapi.helpers.BotCommandHelper;
import ru.paraktikumbot.bot.main.telegramapi.outcomedata.MessageOutcomeData;

@Component
public class EchoCommand implements BotCommandStrategy {

    private final BotCommandHelper helper;
    private final Api api;

    public EchoCommand(Api api,
                       BotCommandHelper helper) {
        this.helper = helper;
        this.api = api;
    }

    @Override
    public boolean apply(Update update) {
        return helper.checkCommand(BotCommand.ECHO, update);
    }

    @Override
    public void process(Update update) {
        api.sendMessage(new MessageOutcomeData()
                .setChatId(update.getMessage().getChat().getId())
                .setText(update.getMessage().getText()));
    }
}
