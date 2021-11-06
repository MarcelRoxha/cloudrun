package br.com.triplice.teste.destack.v1.triplice.teste.destack.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	@RestController
	class HelloworldController {
		@GetMapping("/")
		String hello() {
			return "deu certo";
		}
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
