package com.sys.controller.response;

import java.io.Serializable;
import java.time.LocalDateTime;

public class UserResponse implements Serializable {
    private String username;
    private String password;
    private LocalDateTime data;

    public UserResponse(String username, String password, LocalDateTime data) {
        super();
        this.username = username;
        this.password = password;
        this.data = data;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

}
