package org.sid.servicecompany;

import org.sid.servicecompany.dao.CompagnyRepository;
import org.sid.servicecompany.entities.Company;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ServiceCompanyApplication { //the other way tho use commmndLinerunner is to implement the run metho and
	//definite the method that we want to execute into run function.

	public static void main(String[] args) {
		SpringApplication.run(ServiceCompanyApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompagnyRepository compagnyRepository){
		return args -> {
			Stream.of("A", "B", "C").forEach(cn -> {
				compagnyRepository.save(new Company(null, cn, 100+Math.random()*900));
			});
			compagnyRepository.findAll().forEach(System.out::println);
		};
	}
}
