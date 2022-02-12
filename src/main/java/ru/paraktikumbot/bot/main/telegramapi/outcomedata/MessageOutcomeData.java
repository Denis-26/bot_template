package ru.paraktikumbot.bot.main.telegramapi.outcomedata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageOutcomeData {

    @JsonProperty("chat_id")
    private int chatId;

    private String text;

    public int getChatId() {
        return chatId;
    }

    public MessageOutcomeData setChatId(int chatId) {
        this.chatId = chatId;
        return this;
    }

    public String getText() {
        return text;
    }

    public MessageOutcomeData setText(String text) {
        this.text = text;
        return this;
    }
}
