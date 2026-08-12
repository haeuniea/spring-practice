package com.example.springpractice.controller;

import com.example.springpractice.data.dto.ProductDTO;
import com.example.springpractice.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/api/v1/product-api/product/{productId}
    @GetMapping(value="/product/{productId}")
    public ProductDTO getProduct(@PathVariable String productId) {
        long startTime = System.currentTimeMillis();
        LOGGER.info("[ProductController] perform {} of Spring Boot practice API.","getproduct");

        ProductDTO productDTO = productService.getProduct(productId);
        LOGGER.info("[ProductController] Response :: productId = {}, productName = {}, productPrice = {}, productStock = {}, Response Time = {}ms",
                productDTO.getProductId(), productDTO.getProductName(), productDTO.getProductPrice(), productDTO.getProductStock(),
                (System.currentTimeMillis()-startTime));

        return productDTO;
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
