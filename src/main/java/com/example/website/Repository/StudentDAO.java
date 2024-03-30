package com.example.website.Repository;

import com.example.website.domain.StudentUser;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Scope("singleton")
@Component("studentDAO")
public class StudentDAO implements DAO<StudentUser> {
    private List<StudentUser> studentUserList=new ArrayList<>();
//    int userId=studentUserList.size();

    @Override
    public Optional<StudentUser> get(Integer id) {
        if(!studentUserList.isEmpty()){
            return Optional.of(studentUserList.get(id));
        }
        return Optional.empty();
    }
    @Override
    public int save(StudentUser studentUser) {
        int userId=studentUserList.size();
        studentUser.setId(userId);
        studentUserList.add(studentUser);
        System.out.println("Student Saved..."+ userId);
        return userId;
    }
    public String getnamebyID(int userId){
        for(StudentUser user: studentUserList){
//            System.out.println(user.getName());
            if(userId==user.getId()) {
//                System.out.println(user.getId());

                return user.getName();
            }
        }
        return null;
    }




}
