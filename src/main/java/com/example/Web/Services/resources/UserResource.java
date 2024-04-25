package com.example.Web.Services.resources;

import com.example.Web.Services.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Maria","teste@gmail.com","1212121","12345");
        return ResponseEntity.ok().body(u);
    }
}
