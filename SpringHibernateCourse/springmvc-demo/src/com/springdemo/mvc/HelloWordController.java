package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWordController {
		
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloword-form";
	}

//	@RequestMapping("/processForm")
//	public String processForm(HttpServletRequest request, Model model) {
//		
//		String name = "Message: "+request.getParameter("studentName");
//		
//		model.addAttribute("message", name);
//		
//		return "helloword";
//	}

	@RequestMapping("/processForm")
	public String processForm(@RequestParam("studentName") String name, Model model) {
				
		model.addAttribute("message", name);
		
		return "helloword";
	}
}
