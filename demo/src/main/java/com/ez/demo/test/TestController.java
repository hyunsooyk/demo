package com.ez.demo.test;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {

	public String test() {
		System.out.println("test by hong - TestController");
		System.out.println("hong!!!!");
		return "/index";
	}
}
