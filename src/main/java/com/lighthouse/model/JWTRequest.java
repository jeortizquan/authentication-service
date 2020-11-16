package com.lighthouse.model;

import java.io.Serializable;

public class JWTRequest  implements Serializable {

    private static final long serialVersionUID = -2315630150648297504L;

    private String username;
    private String password;

    //default constructor for JSON Parsing
    public JWTRequest() {

    }

    public JWTRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}