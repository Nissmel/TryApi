package io.nissmel.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicControler {

	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi and welcome!";
	}
}
