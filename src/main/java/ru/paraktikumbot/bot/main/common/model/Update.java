package ru.paraktikumbot.bot.main.common.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.paraktikumbot.bot.main.telegramapi.incomedata.Message;

public class Update {

    @JsonProperty(value = "update_id")
    private Integer updateId;

    private Message message;

    public Message getMessage() {
        return message;
    }

    public Update setMessage(Message message) {
        this.message = message;
        return this;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public Update setUpdateId(Integer updateId) {
        this.updateId = updateId;
        return this;
    }
}
