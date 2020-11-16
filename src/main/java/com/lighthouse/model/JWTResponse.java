package com.lighthouse.model;

import java.io.Serializable;

public class JWTResponse implements Serializable {

    private static final long serialVersionUID = -5343528721211616766L;
    private final String jwtToken;

    public JWTResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getToken() {
        return this.jwtToken;
    }
}
