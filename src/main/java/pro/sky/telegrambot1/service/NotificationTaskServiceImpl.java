package pro.sky.telegrambot1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot1.entity.NotificationTask;
import pro.sky.telegrambot1.repository.NotificationTaskRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationTaskServiceImpl implements NotificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;
@Override
    public void save(NotificationTask task) {
        notificationTaskRepository.save(task);
    }

    @Override
    public void delete(NotificationTask task) {
        notificationTaskRepository.delete(task);
    }

    @Override
    public List<NotificationTask> findAllByNotificationDateTime(LocalDateTime localDateTime) {
        return notificationTaskRepository.findAllByNotificationDataTime(localDateTime);
    }

}
