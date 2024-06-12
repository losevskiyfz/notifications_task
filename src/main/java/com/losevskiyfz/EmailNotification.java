package com.losevskiyfz;

public class EmailNotification extends NotificationDecorator{

    EmailNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Email notification: " + message);
    }

}
