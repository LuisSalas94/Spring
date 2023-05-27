package com.spring.core.assigment;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource{

    @Override
    public String[] getEmails() {
        String[] emails = {"luis@gmail.com", "claudia@gmail.com", "gozde@gmail.com"};
        return emails;
    }
}
