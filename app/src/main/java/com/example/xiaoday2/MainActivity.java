package com.example.xiaoday2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.xiaoday2.factory.TrueFactory;
import com.example.xiaoday2.model.ArmComputer;
import com.example.xiaoday2.model.CodeComputer;
import com.example.xiaoday2.observers.MyObservable;
import com.example.xiaoday2.observers.MyObserver;
import com.example.xiaoday2.product.ProductA;
import com.example.xiaoday2.product.ProductB;
import com.example.xiaoday2.single.DesignModel;
import com.example.xiaoday2.single.DesignModel2;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        //饿汉单例模式
        method();
        //懒汉单例模式
        method1();
        //观察者模式
        method2();
        //终极工厂
        method3();
        //模板模式测试
        method4();
    }

    private void method4() {

        CodeComputer codeComputer = new CodeComputer();
        codeComputer.startUP();

        ArmComputer armComputer = new ArmComputer();
        armComputer.startUP();
    }

    private void method3() {

        TrueFactory trueFactory = new TrueFactory();

        ProductA productA = trueFactory.createProduct(ProductA.class);
        productA.say();

        ProductB productB = trueFactory.createProduct(ProductB.class);
        productB.say();
    }

    private void method2() {
        MyObserver observer = new MyObserver("孙悟空");
        MyObserver observer1 = new MyObserver("猪八戒");
        MyObserver observer2 = new MyObserver("沙摩柯");

        MyObservable myObservable = new MyObservable();

        myObservable.addObserver(observer);
        myObservable.addObserver(observer1);
        myObservable.addObserver(observer2);


        myObservable.sendMessage("唐僧肉来了");
    }

    private void method1() {
        DesignModel2 instance = DesignModel2.getInstance();
        Log.e("tag", "method1: "+instance );
    }


    private void method() {
        DesignModel instance = DesignModel.getInstance();
        Log.e("tag", "method: "+instance);
    }
}
