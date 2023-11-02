package pro.sky.telegrambot1.config;

import com.pengrad.telegrambot.TelegramBot;
import lombok.Data;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;


@Configurable
@Data
public class BotConfig {

    @Value("${telegram.bot.token}")
    private String token;

    @Value("${telegram.bot.msg.start}")
    private String startMsg;

    @Value("${telegram.bot.msg.error}")
    private String errorMsg;

    @Value("${telegram.bot.msg.success}")
    private String successMsg;

    @Value("${telegram.bot.msg.help}")
    private String helpMsg;

    @Bean
    public TelegramBot telegramBot() {
        return new TelegramBot(token);
    }



}
