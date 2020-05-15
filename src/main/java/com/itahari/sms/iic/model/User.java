package com.itahari.sms.iic.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
    @Id
    private String username;
    private String password;
    private boolean isEnabled;
    private String roles;

    public User() {
    }

    public User(String username, String password, boolean isEnabled, String roles) {
        this.username = username;
        this.password = password;
        this.isEnabled = isEnabled;
        this.roles = roles;
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

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}