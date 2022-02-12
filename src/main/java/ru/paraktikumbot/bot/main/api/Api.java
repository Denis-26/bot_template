package ru.paraktikumbot.bot.main.api;

import ru.paraktikumbot.bot.main.telegramapi.outcomedata.MessageOutcomeData;

public interface Api {

    void sendMessage(MessageOutcomeData message);

}
