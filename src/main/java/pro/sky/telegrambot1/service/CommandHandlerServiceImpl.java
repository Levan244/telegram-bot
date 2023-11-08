package pro.sky.telegrambot1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.sky.telegrambot1.config.BotConfig;
import pro.sky.telegrambot1.entity.NotificationTask;
import pro.sky.telegrambot1.exception.IncorrectCreateTaskCommandException;
import pro.sky.telegrambot1.util.MessageUtil;

@Service
@RequiredArgsConstructor
public class CommandHandlerServiceImpl implements CommandHandlerService {
    private final NotificationTaskService notificationTaskService;
    private final BotConfig config;


    private static final String START_COMMAND = "/start";
    private static final String HELP_COMMAND = "/help";

    @Override
    public String handleCommand(Long chatId, String command) {
        switch (command) {
            case START_COMMAND:
                return config.getStartMsg();
            case HELP_COMMAND:
                return config.getHelpMsg();
            default:
                return handleCreateTaskCommand(chatId, command);
        }

    }

    private String handleCreateTaskCommand(Long chatId, String command) {
        try {
            NotificationTask notificationTask = MessageUtil.parseCreateCommand(chatId, command);
            notificationTaskService.save(notificationTask);
            return config.getErrorMsg();
        } catch (IncorrectCreateTaskCommandException e) {
            return config.getErrorMsg();
        }
    }

}
