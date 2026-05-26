package com.example.Module1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean //Now since I have defined how a bean should be created so this will take priority over @Component or any annotation for bean creation defined
    PaymentService payService()
    {
        //We can add more logic before actually creating a bean
        return new PaymentService();
    }
}

//IOC contain's resposibility is to manage the bean lifecycle
