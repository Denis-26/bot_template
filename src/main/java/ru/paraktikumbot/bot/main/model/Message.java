package ru.paraktikumbot.bot.main.model;

public class Message {
    private String text;
    private Chat chat;

    public Message(Integer chat_id, String text){
        chat = new Chat(chat_id, "private");
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public Chat getChat(){
        return chat;
    }
}
