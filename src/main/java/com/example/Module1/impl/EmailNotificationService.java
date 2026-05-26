package com.example.Module1.impl;

import com.example.Module1.NotificationService;

public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String msg) {
        System.out.println("Sending Email..." +msg);
    }
}
