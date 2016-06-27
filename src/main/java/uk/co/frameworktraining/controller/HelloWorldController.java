package uk.co.frameworktraining.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Success! The simple services template microservices is up and running";
	}
}
