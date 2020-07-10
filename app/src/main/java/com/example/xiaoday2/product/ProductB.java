package com.example.xiaoday2.product;

import android.util.Log;

public class ProductB implements Product{
    @Override
    public void say() {
        Log.e("tag", "say: "+"我是产品b" );
    }
}
