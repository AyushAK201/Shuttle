package com.example.Module1.impl;

import com.example.Module1.NotificationService;

public class smsNotificationService implements NotificationService {

    @Override
    public void send(String msg) {
        System.out.println("Sending SMS..." +msg);
    }
}
