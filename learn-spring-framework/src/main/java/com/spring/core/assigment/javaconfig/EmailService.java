package com.spring.core.assigment.javaconfig;

import org.springframework.context.annotation.Primary;

public class EmailService {
    // Java based configuration
    private DataSource dataSource;
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    void sendEmail() {
       String[] emails = dataSource.getEmails();
       for(String email: emails) {
           System.out.println(email);
       }
    }
}
