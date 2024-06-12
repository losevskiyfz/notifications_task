package com.losevskiyfz;

public class NotificationDecorator implements Notification {

    private Notification notification;

    NotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void send(String message) {
        notification.send(message);
    }
}
