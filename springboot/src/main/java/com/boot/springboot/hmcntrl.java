package com.boot.springboot;

//import javax.swing.text.View;

//import java.util.Map;

//import org.springframework.ui.ModelMap;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hmcntrl{
	@RequestMapping("/loginz")
	public String login() {
		return "login";
	}
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

}