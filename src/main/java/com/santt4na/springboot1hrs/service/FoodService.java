package com.santt4na.springboot1hrs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.santt4na.springboot1hrs.model.Food;
import com.santt4na.springboot1hrs.repository.FoodRepository;

@Service
public class FoodService {

   private final FoodRepository repository;

   public FoodService(FoodRepository repository) {
      this.repository = repository;
   }

   // Listar
   public List<Food> getAll() {
      return repository.findAll();
   }

   // Criar
   public Food save(Food food) {
      return repository.save(food);
   }

   // Deletar
   public void delete(Long id) {
      repository.deleteById(id);
   }
}
