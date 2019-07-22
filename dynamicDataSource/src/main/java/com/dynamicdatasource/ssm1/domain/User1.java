package com.dynamicdatasource.ssm1.domain;

public class User1 {
    private String name;

    @Override
    public String toString() {
        return "User1{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User1() {
    }

    public User1(String name) {
        this.name = name;
    }
}
