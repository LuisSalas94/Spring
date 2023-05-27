package com.spring.core.assigment.javaconfig;

public class MySQLDataSource implements DataSource {

    @Override
    public String[] getEmails() {
        String[] emails = {"luis@gmail.com", "claudia@gmail.com", "gozde@gmail.com"};
        return emails;
    }
}
