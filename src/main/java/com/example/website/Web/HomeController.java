package com.example.website.Web;

import com.example.website.Service.UserService;
import com.example.website.Service.UserSupportService;
import com.example.website.Service.UserSupportServiceMssg;
import com.example.website.domain.StudentUser;
import com.example.website.domain.User;
import com.example.website.domain.UserSupportMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    UserService userService;

    @RequestMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @RequestMapping("/registration")
    public String getRegistrationPage(Model uiModel){
        User studentuser=userService.getUser();
// in the above line of code we get the student instance  by StudentService
        uiModel.addAttribute("user",studentuser);
        return "registration";
    }

    @RequestMapping("/registerUser")
    public String createdUser(@ModelAttribute(value="user")StudentUser studentUser){
       int userID= userService.signUp(studentUser.getName(),studentUser.getGender(),studentUser.getLocation(),studentUser.getCollege());
       if(userID!=(-1) ){
           ModelAndView modelAndView=new
                   ModelAndView("redirect:welcome?id="+userID);
//           return "welcome"; -- this is Sending the static page we will now send the view through ModelAndView
           return modelAndView.getViewName();
       }
        return "registration";
    }

//    we can access this above user ID using the request param
    @RequestMapping("/welcome")
    public String showWelcomepage(@RequestParam("id") String userID, ModelMap map){
        map.addAttribute("userID",userID);
        return "welcome";

    }
    @RequestMapping("/message")
    public String welcomemssg(Model msModel){
        msModel.addAttribute("msg" ,"welcome to coding ninjas");
        return "welcome";

    }
}
