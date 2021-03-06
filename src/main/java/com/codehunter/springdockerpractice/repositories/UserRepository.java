package com.codehunter.springdockerpractice.repositories;

import com.codehunter.springdockerpractice.entites.UserDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDAO, Long> {
}
