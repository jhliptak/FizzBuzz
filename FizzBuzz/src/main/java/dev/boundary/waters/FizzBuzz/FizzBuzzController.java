package dev.boundary.waters.FizzBuzz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring")
public class FizzBuzzController {
	
	
	@GetMapping(value = "/hello", produces = "text/plain")
	public String hello() {
		return "test";
	}

}
