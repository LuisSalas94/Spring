package com.spring.core.assigment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgreSQLDataSource implements DataSource{
    @Override
    public String[] getEmails() {
        String[] emails = {"luis@gmail.com", "claudia@gmail.com", "gozde@gmail.com"};
        return emails;
    }
}
