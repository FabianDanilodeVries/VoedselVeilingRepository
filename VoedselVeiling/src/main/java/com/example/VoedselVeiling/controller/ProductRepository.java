package com.example.VoedselVeiling.controller;

import com.example.VoedselVeiling.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProductRepository extends CrudRepository<Product, Long> {

}
