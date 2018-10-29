package com.heyhelps.usermicroservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heyhelps.usermicroservice.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}