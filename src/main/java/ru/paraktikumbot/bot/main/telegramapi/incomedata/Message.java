package ru.paraktikumbot.bot.main.telegramapi.incomedata;

import java.util.List;

public class Message {

    private Chat chat;
    private String text;
    private List<MessageEntity> entities;

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public Chat getChat() {
        return chat;
    }

    public Message setChat(Chat chat) {
        this.chat = chat;
        return this;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public Message setEntities(List<MessageEntity> entities) {
        this.entities = entities;
        return this;
    }
}
