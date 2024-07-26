package com.example.Elasticsearch_spring.businessLogicModule.controller;

import com.example.Elasticsearch_spring.dataModule.model.Product;
import com.example.Elasticsearch_spring.dataModule.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ApiController {
    private ProductRepo  productRepo;



    @GetMapping
    private List<Product> getProducts(){
        return productRepo.findAll();
    }
}
