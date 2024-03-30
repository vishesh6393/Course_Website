package com.example.website.Web;

import com.example.website.Service.StudentUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class SignupController {
    @Autowired
    StudentUserService studentUserService;

    @RequestMapping("instructors")
    public String showInstructor(ModelMap map)
    {
        HashMap<String,Object> instructor=new HashMap<String,Object>();
        instructor.put("name","Vishesh");
        instructor.put("age",23);
        instructor.put("id",7);

        ArrayList<HashMap<String,Object>> listOfInsturctors=
                new ArrayList<HashMap<String,Object>>();
        listOfInsturctors.add(instructor);
//      we have to send this key value pair of instructor to the view
        map.addAttribute("instructors",listOfInsturctors);
        return "instructors";
    }

    @RequestMapping("/profile/{profileID}")
    public String Showprofile(@PathVariable("profileID") String profileID,ModelMap map){
        map.addAttribute("profileID",profileID);

        return "profile";





    }


}
