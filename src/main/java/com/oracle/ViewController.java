package com.oracle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

	@GetMapping("/info")
	public String info(ModelMap mp)
	{
		mp.addAttribute("obj", "Rajesh");
		return "info";
	}
	
}
