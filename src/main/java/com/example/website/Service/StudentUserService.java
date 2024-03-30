package com.example.website.Service;


import com.example.website.Repository.StudentDAO;
import com.example.website.domain.StudentUser;
import com.example.website.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentUserService implements UserService{
    @Autowired
    StudentUser studentUser;

    @Autowired
    private StudentDAO studentDAO;


    @Override
    public User getUser() {
        return studentUser;
    }
    public String studentname(int userId) {
        return studentDAO.getnamebyID(userId); // Use StudentDAO directly to get student name
    }



//     we have to make this signup function to return int which
//    is used by registration and transfer the id to the welcome page

    @Override
    public int signUp(String name,String gender,String location,String college){
        boolean isSignedUp=studentUser.createUser(name,gender,location,college);
        if(isSignedUp){
            return studentUser.saveUser();
        }
        return -1;
    }

}
