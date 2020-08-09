package com.bepoc.BestEstimate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserRepository.class,DHRTBRRepository.class, AccountBERepository.class, AccountSummaryRepository.class})
public class BestEstimateApplication {


	public static void main(String[] args) {
		SpringApplication.run(BestEstimateApplication.class, args);
	}

}
