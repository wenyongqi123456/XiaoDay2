package com.example.xiaoday2.factory;

import com.example.xiaoday2.product.Product;

public interface LastFactory {
    <T extends Product> T createProduct(Class<T> cls);
}
