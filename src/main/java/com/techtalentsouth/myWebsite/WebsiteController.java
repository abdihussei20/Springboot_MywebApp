package com.techtalentsouth.myWebsite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebsiteController {

	@RequestMapping("/Pages/index") 
		public String index(Website Pages ) {
		return "/Pages/index";
	}
	@RequestMapping("/Pages/contactUs") 
	public String contactUs(Website Pages ) {
	return "/Pages/contactUs";
	}
	
	@RequestMapping("/Pages/pricing") 
	public String pricing(Website Pages ) {
	return "/Pages/pricing";
	}
}
