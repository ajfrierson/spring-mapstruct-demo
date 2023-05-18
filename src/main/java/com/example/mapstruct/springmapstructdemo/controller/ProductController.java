package com.example.mapstruct.springmapstructdemo.controller;

import com.example.mapstruct.springmapstructdemo.dto.ProductDTO;
import com.example.mapstruct.springmapstructdemo.mapper.ProductMapper;
import com.example.mapstruct.springmapstructdemo.model.Product;
import com.example.mapstruct.springmapstructdemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductRepository productRepository;

    public ResponseEntity<Product> getProductById(Long id) {
        return new ResponseEntity<>(productRepository.getById(id), HttpStatus.OK);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> save(@RequestBody ProductDTO productDTO){
        return new ResponseEntity<>(productRepository.saveAndFlush(
                productMapper.dtoToModel(productDTO)), HttpStatus.CREATED);
    }
//
//    public ResponseEntity<List<Product>> findAll(){
//        return new ResponseEntity<>(productMapper.modelTODtos(
//                productRepository.findAll()), HttpStatus.OK);
//    }
}
