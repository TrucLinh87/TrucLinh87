package com.example.demoapp.Models.Dto.Requests;

public class LoginRequestDTO {

    private String email;

    private String password;

    public LoginRequestDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
