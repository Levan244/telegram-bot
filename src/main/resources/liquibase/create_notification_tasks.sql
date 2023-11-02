--liquibase formatted sql

--changeset pantsulaia: create_notification_tasks
CREATE TABLE notification_tasks
(
    id SERIAL,
    message TEXT NOT NULL,
    chat_id BIGINT NOT NULL,
    notification_data_time TIMESTAMP NOT NULL
);