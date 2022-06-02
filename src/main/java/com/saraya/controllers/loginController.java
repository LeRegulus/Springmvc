//package com.saraya.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.SessionAttributes;
//
//@Controller
//@SessionAttributes("username")
//public class loginController {
//
//	@RequestMapping("/")
//	public String index() {
//		return "index";
//	}
//
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login(@RequestParam String username, @RequestParam String password, ModelMap model){
//		if (username.equalsIgnoreCase("regulusAlou") && password.equalsIgnoreCase("Saliou1946")){
//			model.addAttribute("username", username);
//			return "redirect:home";
//		}
//		return "index";
//	}
//}