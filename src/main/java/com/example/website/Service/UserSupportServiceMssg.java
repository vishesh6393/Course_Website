package com.example.website.Service;

import com.example.website.domain.SupportMessage;
import com.example.website.domain.User;
import com.example.website.domain.UserSupportMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("userSupportService")
public class UserSupportServiceMssg implements UserSupportService{

//    in this service we have to implement

    @Autowired
    UserSupportMessage userSupportMessage;
    @Autowired
    SupportMessage supportMessage;
    @Override
    public String createMssg(int userID) {
        userSupportMessage.setUser(userID);
        System.out.println("Message for console check: "+ userSupportMessage.getMssg());
        return userSupportMessage.getMssg();
    }
}
