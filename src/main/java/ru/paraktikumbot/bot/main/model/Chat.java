package ru.paraktikumbot.bot.main.model;

public class Chat {
    private Integer id;
    private String type;

    Chat(Integer id, String type){
        this.id = id;
        this.type = type;
    }

    public Integer getId(){
        return id;
    }
    public String getType(){
        return type;
    }
}
