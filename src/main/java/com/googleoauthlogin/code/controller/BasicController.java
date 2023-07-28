package com.googleoauthlogin.code.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	
	@GetMapping("/getmessage")
	public String getMessage(){
		
		return "got authenticated";
		
	}
	@GetMapping("/getuser")
	public String getUser(Principal principal) {
		
		
		return "username"+principal.getName();
	}

}
