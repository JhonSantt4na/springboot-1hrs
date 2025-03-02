package com.santt4na.springboot1hrs.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "food_table")
@AllArgsConstructor
@NoArgsConstructor
public class Food {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private Integer qtty;
   private LocalDate expDate;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Integer getQtty() {
      return qtty;
   }

   public void setQtty(Integer qtty) {
      this.qtty = qtty;
   }

   public LocalDate getExpDate() {
      return expDate;
   }

   public void setExpDate(LocalDate expDate) {
      this.expDate = expDate;
   }
}
