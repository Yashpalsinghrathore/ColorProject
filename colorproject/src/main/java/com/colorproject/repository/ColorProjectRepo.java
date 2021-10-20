package com.colorproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colorproject.model.Color;


public interface ColorProjectRepo extends JpaRepository<Color, Integer> {

}
