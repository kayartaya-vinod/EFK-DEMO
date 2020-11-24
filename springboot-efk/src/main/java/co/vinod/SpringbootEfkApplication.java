package co.vinod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@SpringBootApplication
public class SpringbootEfkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEfkApplication.class, args);
	}

	@GetMapping("/api/hello")
	public String hello(){
        log.info("Hello, world!");
		return "Hello, world!";
	}

}
