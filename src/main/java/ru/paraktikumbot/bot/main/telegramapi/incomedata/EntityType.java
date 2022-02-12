package ru.paraktikumbot.bot.main.telegramapi.incomedata;

public enum EntityType {

    BOT_COMMAND("bot_command");

    private final String type;

    EntityType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
