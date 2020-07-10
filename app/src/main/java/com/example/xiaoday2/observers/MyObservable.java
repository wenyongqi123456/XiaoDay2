package com.example.xiaoday2.observers;

import java.util.Observable;

public class MyObservable extends Observable {
    public void sendMessage(String name){
        setChanged();//新消息发生改变
        notifyObservers(name);//向所有观察者发送消息

    }
}
