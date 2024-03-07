package com.phonebook.phonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaRepositories
public class PhonebookApplication {
	public static void main(String[] args) {
		SpringApplication.run(PhonebookApplication.class, args);
	}

}
