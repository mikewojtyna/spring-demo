package pl.sdacademy.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/my-login")
	public String loginForm(){
		return "my-login";
	}
}