package com.example.bean;

// import lombok.AllArgsConstructor;
// import lombok.Data;

// @Data
// @AllArgsConstructor
public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
