package com.example.VoedselVeiling.rest;

import com.example.VoedselVeiling.controller.ProductService;
import com.example.VoedselVeiling.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductEndpoint {

    @Autowired
    ProductService ps;

    @GetMapping("/voedselveiling")
    public Iterable<Product> probeerVerbindingTeMaken() {
        System.out.println("test1");
        return ps.returnAllProducts();
    }
    @PostMapping("/request")
    public Product returnRequestBody(@RequestBody Product p) {
        System.out.println("test");
        return ps.addToRepository(p);
    }
}
