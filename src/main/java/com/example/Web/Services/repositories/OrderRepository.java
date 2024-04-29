package com.example.Web.Services.repositories;

import com.example.Web.Services.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}