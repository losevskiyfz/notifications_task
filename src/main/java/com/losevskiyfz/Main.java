package com.losevskiyfz;

public class Main {
    public static void main(String[] args) {

        NotificationDecorator notificationDecorator =
                new EmailNotification(
                        new SmsNotification(
                                new PushNotification(
                                        new NotificationSource()
                                )
                        )
                );

        notificationDecorator.send("New updates are available!");

    }
}
