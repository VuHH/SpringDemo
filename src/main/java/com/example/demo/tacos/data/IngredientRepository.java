package com.example.demo.tacos.data;

import com.example.demo.tacos.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
//    Iterable<Ingredient> findAll();
//    Ingredient findOne(String id);
//    Ingredient save(Ingredient ingredient);
}
