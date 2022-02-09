package ru.paraktikumbot.bot.main.model;

public class Message2Telegram {
    public Integer chat_id;
    public String text;

    public Message2Telegram(Integer chatId, String text){
        this.chat_id = chatId;
        this.text = text;
    }
}
