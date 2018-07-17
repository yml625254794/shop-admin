package shopAdminTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	@RequestMapping(method=RequestMethod.GET,value="/login")
	public String login(@RequestParam(required=false)String error,Model model){
		if (error!=null) {
			model.addAttribute("loginerror",true);
		}
		
		return "login";
	}
}
