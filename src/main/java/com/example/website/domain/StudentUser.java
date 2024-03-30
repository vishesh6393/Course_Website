package com.example.website.domain;


import com.example.website.Repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("user")
public class StudentUser implements User{
    String name;
    String gender;

    String location;
    String college;

    int Id;
    @Autowired
    StudentDAO studentDAO;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    boolean isCreated =false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }



    @Override
    public boolean createUser(String name, String gender, String location, String college) {
        this.name=name;
        this.gender=gender;
        this.location=location;
        this.college=college;
        isCreated=true;
        return isCreated;
    }

    @Override
    public Integer saveUser() {
        System.out.println(this.name+" is successfully registered on the server");
        System.out.println("");
        return studentDAO.save(this);

    }
    @Override
    public String getstudentbyId(int userId){

        return studentDAO.getnamebyID(userId);
    }

}
