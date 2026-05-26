package com.example.Module1.impl;

import com.example.Module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "notification.type" , havingValue="sms")
public class smsNotificationService implements NotificationService {

    @Override
    public void send(String msg) {
        System.out.println("Sending SMS..." +msg);
    }
}
