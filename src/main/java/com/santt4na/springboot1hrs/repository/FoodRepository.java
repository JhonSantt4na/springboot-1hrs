package com.santt4na.springboot1hrs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santt4na.springboot1hrs.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
}