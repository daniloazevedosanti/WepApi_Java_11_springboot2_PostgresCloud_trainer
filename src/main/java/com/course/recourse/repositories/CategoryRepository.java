package com.course.recourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.recourse.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
