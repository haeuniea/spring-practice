package com.example.springpractice.data.handler;

import com.example.springpractice.data.entity.ProductEntity;

public interface ProductDataHandler {
    ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock);
    ProductEntity getProductEntity(String productId);
}
