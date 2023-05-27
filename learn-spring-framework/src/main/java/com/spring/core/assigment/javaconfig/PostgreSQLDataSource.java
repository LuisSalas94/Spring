package com.spring.core.assigment.javaconfig;

public class PostgreSQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String[] emails = {"luis@gmail.com", "claudia@gmail.com", "gozde@gmail.com"};
        return emails;
    }
}
