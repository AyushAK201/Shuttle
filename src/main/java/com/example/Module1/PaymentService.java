package com.example.Module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component   // This annotation marks the class as a bean which is then managed by the springframe itself so we don't have to create or initilise the object of this class
             // We can also use @Service annotation as well
public class PaymentService {

    public void Pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterInit()
    {
      System.out.println("Before Paying...");
    }

    @PreDestroy
    public void beforeDestroy()
    {
       System.out.println("After Payment...");
    }
}
