package com.example.website.Web;

import com.example.website.Service.StudentUserService;
import com.example.website.Service.UserSupportServiceMssg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SupportController {

    @Autowired
    UserSupportServiceMssg userSupportServiceMssg;

    @Autowired
    StudentUserService studentUserService;

    @RequestMapping("/support")
    public String getSupportPage(@RequestParam("id") String id, ModelMap uiModel){
//        String finalmssg=userSupportServiceMssg.createMssg(Integer.parseInt(id));
//        uiModel.addAttribute("message",finalmssg);
        int ID =Integer.parseInt(id);
        String name=studentUserService.studentname(ID);
        System.out.println("Name of student is= "+name);

        uiModel.addAttribute("message","this is suppport page of id= "+name);
        return "support";

    }
}

