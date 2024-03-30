package com.example.website.domain;

import org.springframework.stereotype.Component;

@Component
public interface User {

    public boolean createUser(String name,String gender,String location,String college);

    public Integer saveUser();
    public String getstudentbyId(int userId);

}
