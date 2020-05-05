package com.alterTab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping({"/home","/"})
	public String home(){
		return "index"; 
	}
	
	@RequestMapping("/aboutUs")
	public String aboutUs(){
		return "aboutUs"; 
	}
	
	@RequestMapping("/projects")
	public String projects(){
		return "projects"; 
	}
	
	@RequestMapping("/services")
	public String services(){
		return "services"; 
	}
	
	@RequestMapping("/contactUs")
	public String contactUs(){
		return "contactUs"; 
	}
	
	@RequestMapping("/navigationBar")
	public String navigationBar(){
		return "navigationBar"; 
	}
	
}
