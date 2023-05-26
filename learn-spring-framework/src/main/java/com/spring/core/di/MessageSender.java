package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    // Field Based Dependency Injection
    @Autowired
    @Qualifier("emailService")
    private MessageService messageService;
    @Autowired
    private MessageService smsService;

    // Constructor based Dependency Injection
//    //@Autowired
//    public MessageSender(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//        System.out.println("Constructor based dependency injection 1");
//    }
//
//    @Autowired
//    public MessageSender(@Qualifier("emailService") MessageService messageService, MessageService smsService) {
//        this.messageService = messageService;
//        this.smsService = smsService;
//        System.out.println("Constructor based dependency injection 2");
//    }

    // Setter Based Dependency Injection
//    @Autowired
//    public void setMessageService(@Qualifier("emailService") MessageService messageService) {
//        this.messageService = messageService;
//        System.out.println("Setter based dependency injection 1");
//    }
//
//    @Autowired
//    public void setSmsService(MessageService smsService) {
//        this.smsService = smsService;
//        System.out.println("Setter based dependency injection 2");
//    }

    public void sendMessage(String message) {
        this.messageService.sendMessage(message);
        this.smsService.sendMessage(message);
    }
}
