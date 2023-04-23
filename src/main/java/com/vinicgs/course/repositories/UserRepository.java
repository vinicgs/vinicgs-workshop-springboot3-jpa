package com.vinicgs.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicgs.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
