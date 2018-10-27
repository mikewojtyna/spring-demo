package pl.sdacademy.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {

	private Dashboard dashboard;

	@Autowired
	public DashboardController(Dashboard dashboard) {
		this.dashboard = dashboard;
	}

	@ModelAttribute("msg")
	public String msg() {
		return dashboard.findAllMsg().iterator().next();
	}

	@GetMapping
	public String findAllMsg() {
		return "all-msg";
	}
}
