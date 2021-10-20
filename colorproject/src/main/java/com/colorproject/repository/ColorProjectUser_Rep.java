package com.colorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colorproject.model.User;

public interface ColorProjectUser_Rep extends JpaRepository<User, Integer> {

}
