package ru.paraktikumbot.bot.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {

    @JsonProperty(value = "message_id")
    private Integer messageId;

    @JsonProperty(value = "text")
    private String messageText;

    @JsonProperty(value = "chat")
    private Chat chat;

    public Integer getMessageId() {
        return messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public Chat getChat() {
        return chat;
    }
}
