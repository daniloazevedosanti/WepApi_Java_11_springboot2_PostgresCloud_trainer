package com.course.recourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.recourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
