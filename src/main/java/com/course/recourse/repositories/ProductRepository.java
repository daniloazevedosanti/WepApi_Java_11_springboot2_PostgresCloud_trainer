package com.course.recourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.recourse.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
