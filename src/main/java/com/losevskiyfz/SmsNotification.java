package com.losevskiyfz;

public class SmsNotification extends NotificationDecorator {

    SmsNotification(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SMS notification: " + message);
    }

}
