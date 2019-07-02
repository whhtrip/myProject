package com.json;

import java.util.Date;

public class User {
    private String userName;
    private Integer age;
    private Date birthday;
    private Long UserId;

    public User(Long userId, String userName, Integer age, Date birthday) {
        this.userName = userName;
        this.age = age;
        this.birthday = birthday;
        UserId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", UserId=" + UserId +
                '}';
    }


}
