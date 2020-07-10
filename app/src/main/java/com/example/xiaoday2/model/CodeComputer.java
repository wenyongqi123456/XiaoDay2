package com.example.xiaoday2.model;

import android.util.Log;

public class CodeComputer extends AbstractComputer{

    @Override
    public void login() {
        Log.e("tag", "login: "+"程序员的电脑：用账号密码登录即可" );
    }
}
