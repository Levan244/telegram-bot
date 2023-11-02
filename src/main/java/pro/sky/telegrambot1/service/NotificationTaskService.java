package pro.sky.telegrambot1.service;

import pro.sky.telegrambot1.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskService {
    void save(NotificationTask task);

    void delete(NotificationTask task);

    List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime);
}
