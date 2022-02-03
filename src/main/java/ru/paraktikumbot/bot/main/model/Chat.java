package ru.paraktikumbot.bot.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Chat {
    @JsonProperty(value = "id")
    private Integer ID;

    public Integer getID() {
        return ID;
    }
}
