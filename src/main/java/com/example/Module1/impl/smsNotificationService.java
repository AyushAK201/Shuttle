package com.example.Module1.impl;

import com.example.Module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotif")
public class smsNotificationService implements NotificationService {

    @Override
    public void send(String msg) {
        System.out.println("Sending SMS..." +msg);
    }
}
