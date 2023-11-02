package pro.sky.telegrambot1.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "notification-tasks")
public class NotificationTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "chat-id", nullable = false)
    private long chatId;

    @Column(nullable = false)
    private String message;

    @Column(name = "notification_data_time", nullable = false)
    private LocalDateTime notificationDataTime;

    public NotificationTask(long chatId, String message, LocalDateTime notificationDataTime) {
        this.chatId = chatId;
        this.message = message;
        this.notificationDataTime = notificationDataTime;
    }
}
