package com.example.springpractice.controller;

import com.example.springpractice.data.dto.ProductDTO;
import com.example.springpractice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/product-api")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @GetMapping(value="/product/{productId}")
    public ProductDTO getProduct(@PathVariable String productId) {
        return productService.getProduct(productId);
    }

    // http://localhost:8080/api/v1/product-api/product
    @PostMapping(value="/product")
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        String productID = productDTO.getProductId();
        String productName = productDTO.getProductName();
        int productPrice = productDTO.getProductPrice();
        int productStock = productDTO.getProductStock();

        return productService.saveProduct(productID, productName, productPrice, productStock);
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @DeleteMapping(value="/product/{productId}")
    public ProductDTO deleteProduct(@PathVariable String productId) {
        return null;
    }
}
