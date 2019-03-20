package com.commons;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcomMSg}")
	private String message;

	@RequestMapping("/")
	public String dashboard(Map<String, Object> model) {
		model.put("msg", this.message);
		return "index";
	}

}

