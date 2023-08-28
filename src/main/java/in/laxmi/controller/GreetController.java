package in.laxmi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RequestMapping using to overcome class level url ambiguity
@RequestMapping("greet")
public class GreetController {
	// path is localhost:8080/greet/welcome
	@GetMapping("/welcome")
	public  String welcomeMsg(Model model) {
		model.addAttribute("msg", "welcome to page");
		return "index";
	}
	
	/*@GetMapping("/hello")
	public  String sayHello(Model model) {
		String msg ="Hello,how it it";
		return msg;
	}*/
	
}
