package com.bepoc.PhcVol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserRepository.class})
public class PhcVolApplication {


	public static void main(String[] args) {
		SpringApplication.run(PhcVolApplication.class, args);
	}

}
