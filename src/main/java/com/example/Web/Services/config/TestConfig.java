package com.example.Web.Services.config;

import com.example.Web.Services.entities.User;
import com.example.Web.Services.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    //associa uma instancia de UserRepository aqui dentro
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Maria Brown","teste@gmail.com","1212121","12345");
        User u2 = new User(null,"Alex Green","teste2@gmail.com","1561656","12345");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
