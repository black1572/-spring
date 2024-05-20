package com.text.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int id;
    private String name;
    private String password;
    private String phone;

    public User() {
    }

    public User(int id, String userName, String password, String phone) {
        super();
        this.id = id;
        this.name = userName;
        this.password = password;
        this.phone = phone;
    }

    public User(String userName) {
        super();
        this.name=userName;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
