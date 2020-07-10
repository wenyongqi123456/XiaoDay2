package com.example.xiaoday2.model;

import android.util.Log;

public class ArmComputer extends AbstractComputer {
    @Override
    public void login() {
        Log.e("tag", "login: "+"军队的电脑：需要扫描瞳孔才能登录" );
    }
}
