package com.example.xiaoday2.observers;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {
    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.e("tag", "update: "+name+arg );
    }
    public void ff(){

    }
}
