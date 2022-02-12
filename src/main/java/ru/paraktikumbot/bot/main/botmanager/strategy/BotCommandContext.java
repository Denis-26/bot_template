package ru.paraktikumbot.bot.main.botmanager.strategy;

import org.springframework.stereotype.Component;
import ru.paraktikumbot.bot.main.common.model.Update;

import java.util.List;

@Component
public class BotCommandContext {

    private final List<BotCommandStrategy> strategies;

    public BotCommandContext(List<BotCommandStrategy> strategies) {
        this.strategies = strategies;
    }

    public void process(Update update) {
        for (BotCommandStrategy strategy : strategies) {
            if (strategy.apply(update)) {
                strategy.process(update);
                return;
            }
        }
    }
}
