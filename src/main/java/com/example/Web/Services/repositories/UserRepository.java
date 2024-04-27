package com.example.Web.Services.repositories;

import com.example.Web.Services.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
