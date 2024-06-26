package com.example.Web.Services.config;

import com.example.Web.Services.entities.Category;
import com.example.Web.Services.entities.Order;
import com.example.Web.Services.entities.User;
import com.example.Web.Services.entitities.enums.OrderStatus;
import com.example.Web.Services.repositories.CategoryRepository;
import com.example.Web.Services.repositories.OrderRepository;
import com.example.Web.Services.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    //associa uma instancia de UserRepository aqui dentro
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "teste@gmail.com", "1212121", "12345");
        User u2 = new User(null, "Alex Green", "teste2@gmail.com", "1561656", "12345");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-08-22T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
    }
}
