package com.santt4na.springboot1hrs.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santt4na.springboot1hrs.model.Food;
import com.santt4na.springboot1hrs.service.FoodService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/food")
public class FoodController {

   /*
    * Injection Dependency
    * Podemos usar a anotalcao ou o via Contrutor
    * 
    * @Autowired -> Anotation para Gerenciar a Injecao de Dependencia
    * private final FoodService service;
    * 
    * 
    * Via Construtor ex :
    */

   private final FoodService service;

   public FoodController(FoodService service) {
      this.service = service;
   }

   // Requests

   /*
    * @GetMapping("path") -> Requisicao Get(Leitura) informando o Caminho "path"
    * 
    * @PostMapping("path") -> Requisicao Post(Adiciona) informando o Caminho "path"
    * 
    * @PutMapping("path") -> Requisicao Put(Atualiza) informando o Caminho "path"
    * 
    * @DeleteMapping("path")-> Requisicao Delete(Deleta) passando o Caminho "path"
    */

   @GetMapping("/all")
   public List<Food> getAll() {
      return service.getAll();
   }

   @PostMapping("/create")
   public Food create(@RequestBody Food food) {
      // @RequestBody -> Pede pra mandar no corpo da req
      return service.save(food);
   }

   @DeleteMapping("/{id}")
   public void delete(@PathVariable Long id) {
      service.delete(id);
   }
}
