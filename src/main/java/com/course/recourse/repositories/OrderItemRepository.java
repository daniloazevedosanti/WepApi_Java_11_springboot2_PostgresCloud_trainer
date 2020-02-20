package com.course.recourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.recourse.entities.OrderItem;
import com.course.recourse.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
