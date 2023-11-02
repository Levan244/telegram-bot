package pro.sky.telegrambot1.service;

public interface CommandHandlerService {
    String handleCommand(Long chatId, String command);
}
