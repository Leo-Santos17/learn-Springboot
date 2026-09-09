package dev.sants.Hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam (value = "name", defaultValue = "World")String name)
	{
		return String.format("Hello %s", name);
	}

	@GetMapping("/sum")
	public String sum(@RequestParam (value = "value1") double value1, @RequestParam (value = "value2") double value2)
	{
		return String.format("The sums of %,f + %,f = %,f", value1, value2, value1+value2);
	}

}
