package ru.paraktikumbot.bot.main.botmanager.model;

public enum BotCommand {

    START("/start"),
    HELP("/help"),
    ECHO("/echo");

    private final String command;

    BotCommand(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
