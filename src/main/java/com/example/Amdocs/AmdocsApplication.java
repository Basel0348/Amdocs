package com.example.Amdocs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.packt.Amdocs.domain.logFile;
import com.packt.Amdocs.domain.logFileRepository;

@SpringBootApplication
@EntityScan(basePackages = {"com.pack.Amdocs.domain" })
@EnableJpaRepositories(basePackages = {"com.pack.Amdocs.repository"})
public class AmdocsApplication {

private logFileRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AmdocsApplication.class, args);
	}
	


}

