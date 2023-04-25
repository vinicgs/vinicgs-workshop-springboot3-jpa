package com.vinicgs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicgs.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
