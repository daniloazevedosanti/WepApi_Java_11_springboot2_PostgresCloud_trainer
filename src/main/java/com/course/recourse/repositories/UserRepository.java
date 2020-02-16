package com.course.recourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.recourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
