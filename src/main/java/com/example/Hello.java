package com.example;

import com.example.bean.User;

// import lombok.extern.slf4j.Slf4j;

// @Slf4j
public class Hello {
    public static void main(String[] args) {
        User user = new User("lace", "admin");
        System.out.println("User: " + user.toString() + " learns CodeQL!");
        System.out.println("Hello CodeQL!");
    }
}
