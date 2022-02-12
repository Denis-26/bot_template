package ru.paraktikumbot.bot.main.botmanager.strategy;

import org.springframework.stereotype.Component;
import ru.paraktikumbot.bot.main.api.Api;
import ru.paraktikumbot.bot.main.botmanager.model.BotCommand;
import ru.paraktikumbot.bot.main.common.model.Update;
import ru.paraktikumbot.bot.main.telegramapi.helpers.BotCommandHelper;
import ru.paraktikumbot.bot.main.telegramapi.outcomedata.MessageOutcomeData;

@Component
public class HelpCommand implements BotCommandStrategy {

    private final Api api;
    private final BotCommandHelper helper;

    public HelpCommand(Api api,
                       BotCommandHelper helper) {
        this.api = api;
        this.helper = helper;
    }

    @Override
    public boolean apply(Update update) {
        return helper.checkCommand(BotCommand.HELP, update);
    }

    @Override
    public void process(Update update) {
        String help = "Я могу приветствовать и говорить, что я могу";
        api.sendMessage(new MessageOutcomeData()
                .setText(help)
                .setChatId(update.getMessage().getChat().getId()));
    }
}
