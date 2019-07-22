package com.dynamicdatasource.ssm2.domain;

public class User2 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User2() {
    }

    public User2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                '}';
    }
}
