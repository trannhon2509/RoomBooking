package com.bookingroom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController2 {
	@RequestMapping("home2")
	public String index2() {
		return "index2";
	}
}
