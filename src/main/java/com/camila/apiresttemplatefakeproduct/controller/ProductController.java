package com.camila.apiresttemplatefakeproduct.controller;

import com.camila.apiresttemplatefakeproduct.dto.ProductDTO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public List<ProductDTO> searchAllProducts() {

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<List<ProductDTO>> responseEntity = restTemplate.exchange("https://fakestoreapi.com/products", HttpMethod.GET, null, new ParameterizedTypeReference <List<ProductDTO>>() {});

        return responseEntity.getBody();

    }
}
