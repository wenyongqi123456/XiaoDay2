package com.example.xiaoday2.model;

import android.util.Log;

public abstract class  AbstractComputer {
    private String TAG ="111";

    public void powerOn(){
        Log.i(TAG, "按下电源键");
    }

    public void checkHardware(){
        Log.i(TAG, "检查硬件：主板，cup，内存条");
    }

    public void loadOS(){
        Log.i(TAG, "加载操作系统");
    }

    public abstract void login();

    public void startUP(){//开机流程  固定模板
        Log.i(TAG, "开机");
        powerOn();
        checkHardware();
        loadOS();
        login();
    }
}
