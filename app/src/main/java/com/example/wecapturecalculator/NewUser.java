package com.example.wecapturecalculator;

public class NewUser {
    private String username;
    private String password;
    private String email;

    public NewUser(String username, String email, String password) {
        this.username = username;
        this.username = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}