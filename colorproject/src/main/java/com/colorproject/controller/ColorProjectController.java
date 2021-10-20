package com.colorproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.colorproject.Service.ColorProjectService;
import com.colorproject.model.Color;
import com.colorproject.model.User;

@Controller
public class ColorProjectController {

	@Autowired
	ColorProjectService colorProjectService;
	
	@GetMapping("/userForm")
	public String showUserForm(Model model)
	{
		List<Color> allColor = colorProjectService.getAllColor();
		
		User user = new User();
		
		model.addAttribute("user", user);
		
		model.addAttribute("listOfColor", allColor);
		
		return "userform";
		
		
	}
	
	@PostMapping("/submitForm")
	public String submitUser(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		
		User saveUser = colorProjectService.submitForm(user);
		
		model.addAttribute("saveUser", saveUser);
		
		return "saveuserform";
		
		
	}
	
	@GetMapping("/getAllUser")
	public String getAllUser(Model model)
	{
		
		List<User> allUser = colorProjectService.getAllUser();
		
		model.addAttribute("listOfUser", allUser);
		
		return "alluserform";
		
		
	}
	
	
}
