package com.packt.Amdocs.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.Amdocs.domain.logFile;
import com.packt.Amdocs.domain.logFileRepository;

@RestController

public class logFileController {
	@Autowired
    private logFileRepository repository;

	 @RequestMapping("/logFiles")
     public Iterable<logFile> getlogFiles() {
    	return repository.findAll();
     } 


}
