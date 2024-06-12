package com.losevskiyfz;

public class NotificationSource implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Send a notification through all the decorators: " + message);
    }

}
