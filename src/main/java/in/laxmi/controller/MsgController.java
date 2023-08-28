package in.laxmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController used to over class having direct response to ui
@RestController 
@RequestMapping("/welcome")
public class MsgController {
	//path is localhost:8080/welcome/welcome
	@GetMapping("/welcome")
	public  String welcomeMsg(Model model) {
		model.addAttribute("msg", "welcome to page");
		return "index";
	}
	
	@PostMapping("/hello")
	// @ResponseBody used to direct display direct response se on the page
	@ResponseBody 
	public  String sayHello(Model model) {
		String msg ="Hello,how it it";
		return msg;
	}
	
}
