package com.zsh.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/aaa")
public class ACCC {
	@RequestMapping(value="",method={RequestMethod.GET,RequestMethod.POST})
	 public String test() {
	        return "xxx";
  }
}
