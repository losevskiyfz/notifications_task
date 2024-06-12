package com.losevskiyfz;

public class PushNotification extends NotificationDecorator {

    PushNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("PUSH notification: " + message);
    }
}
