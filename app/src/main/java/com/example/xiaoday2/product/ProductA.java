package com.example.xiaoday2.product;

import android.util.Log;

public class ProductA implements Product{
    @Override
    public void say() {
        Log.e("tag", "say: "+"我是A产品" );
    }
    public void sd(){

    }
}
