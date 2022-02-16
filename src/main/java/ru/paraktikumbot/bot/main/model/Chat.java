package ru.paraktikumbot.bot.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {

    @JsonProperty(value = "id")
    private Integer chatId;

    @JsonProperty(value = "type")
    private String chatType;

    public Integer getChatId() {
        return chatId;
    }

    public String getChatType() {
        return chatType;
    }
}
