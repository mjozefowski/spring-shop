package com.springShop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringShopApplication {
	
	
    @RequestMapping("/hello")
    @ResponseBody
    public String dziendobry() {
        return "Dzień dobry !";
    }
    
    @RequestMapping("/goodbay")
    @ResponseBody
    public String dobranoc() {
        return "Dobranoc !";
    }
	public static void main(String[] args) {
		SpringApplication.run(SpringShopApplication.class, args);
	}
}
