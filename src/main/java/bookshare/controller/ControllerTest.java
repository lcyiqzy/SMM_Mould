package bookshare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {

	@RequestMapping("/toPage")
	public String toPage(){
		
		return "/pages/success.jsp";
	}
}
