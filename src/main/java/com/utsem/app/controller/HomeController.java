package com.utsem.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	@GetMapping("pagina")
	public String getMethodName() {
		return "pagina";
	}
	

}
