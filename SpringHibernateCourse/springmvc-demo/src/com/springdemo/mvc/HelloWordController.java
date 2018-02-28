package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWordController {
		
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloword-form";
	}

	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		String name = "Message: "+request.getParameter("studentName");
		
		model.addAttribute("message", name);
		
		return "helloword";
	}
}
