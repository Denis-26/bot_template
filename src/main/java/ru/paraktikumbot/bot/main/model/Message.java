package ru.paraktikumbot.bot.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Message {
    @JsonProperty(value = "text")
    private String text;

    public String getText() {
        return text;
    }
}