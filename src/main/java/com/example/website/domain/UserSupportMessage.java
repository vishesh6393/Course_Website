package com.example.website.domain;

import org.springframework.stereotype.Component;

@Component
public class UserSupportMessage implements SupportMessage{

    private String mssg;

    public String getMssg() {
        return mssg;
    }

    public void setMssg(String mssg) {
        this.mssg = mssg;
    }

    @Override
    public void setUser(int id) {
        this.mssg = "This is the support page for user id: " + String.valueOf(id);
    }

}
