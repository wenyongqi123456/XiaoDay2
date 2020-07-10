package com.example.xiaoday2.factory;


import com.example.xiaoday2.product.Product;
import com.example.xiaoday2.product.ProductA;
import com.example.xiaoday2.product.ProductB;

public class TrueFactory implements LastFactory{

    @Override
    public <T extends Product> T createProduct(Class<T> cls) {
        Product product=null;
        try {
            product =(Product) Class.forName(cls.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T)product;
    }
}
