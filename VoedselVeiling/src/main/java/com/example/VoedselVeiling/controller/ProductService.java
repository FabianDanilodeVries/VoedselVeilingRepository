package com.example.VoedselVeiling.controller;

import com.example.VoedselVeiling.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    ProductRepository pr;
    public Iterable<Product> returnAllProducts() {
        return pr.findAll();
    }
    public Product addToRepository(Product p) {
        return pr.save(p);
    }
}
