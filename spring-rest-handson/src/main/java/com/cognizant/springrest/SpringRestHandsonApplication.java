package com.cognizant.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.springrest.service.CountryService;

@SpringBootApplication
public class SpringRestHandsonApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringRestHandsonApplication.class, args);

		CountryService service = new CountryService();

		System.out.println(service.getCountry());
	}
}