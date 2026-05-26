package com.example.Module1.impl;

import com.example.Module1.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary  //If there are multiple beans available then the one with Primary would be executed
@Component
@Qualifier("emailNotif")
public class EmailNotificationService implements NotificationService {
    @Override
    public void send(String msg) {
        System.out.println("Sending Email..." +msg);
    }
}
