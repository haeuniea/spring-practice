package com.example.springpractice.service;

import com.example.springpractice.data.dto.ProductDTO;

public interface ProductService {
    ProductDTO saveProduct(String productId, String productName, int productPrice, int productStock);
    ProductDTO getProduct(String productId);
}
