package com.example.demo.tacos.data;

import com.example.demo.tacos.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
    //Taco save(Taco design);
}
