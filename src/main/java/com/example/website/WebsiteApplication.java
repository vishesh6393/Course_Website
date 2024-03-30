package com.example.website;

import com.example.website.Repository.DAO;
import com.example.website.Repository.StudentDAO;
import com.example.website.Service.StudentUserService;
import com.example.website.Service.UserSupportService;
import com.example.website.domain.SupportMessage;
import com.example.website.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class WebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);

//		ApplicationContext context=SpringApplication.run(WebsiteApplication.class, args);
//
//		User user=(User) context.getBean("user");
//		user.createUser("Raaj","male","LKO","SRMU");
//		Integer uId=user.saveUser();
//
//		UserSupportService uss=(UserSupportService) context.getBean("userSupportService");
//
//		System.out.println(uss.createMssg(uId));
//		user.createUser("Vishesh","Male","Ghaziabad","SRMCEM");
//		int userid= user.saveUser();
//		System.out.println(uss.createMssg(userid));
	}

}
