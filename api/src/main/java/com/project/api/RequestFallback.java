package com.project.api;

import com.project.model.Product;

public class RequestFallback implements Request {
    @Override
    public Product getProducts() {
        return new Product();
    }
}
