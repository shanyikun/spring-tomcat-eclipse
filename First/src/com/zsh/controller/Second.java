package com.zsh.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/bbb")
public class Second {
	@RequestMapping(value="",method={RequestMethod.GET,RequestMethod.POST})
	 public String test() {
	        return "yyy";
  }
	
}


