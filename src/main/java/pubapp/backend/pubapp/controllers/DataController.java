package pubapp.backend.pubapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pubapp.backend.pubapp.models.User;
import pubapp.backend.pubapp.repository.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/data")
public class DataController {
    
    @Autowired
	UserRepository userRepository;

    @GetMapping("/testjwt")
	public String testJwt(){
		return "jwt valid";
	}

    @GetMapping("/user")
    public Optional<User> getUser(){
        var test =  userRepository.findById(1L);

        return test;
    }
}
