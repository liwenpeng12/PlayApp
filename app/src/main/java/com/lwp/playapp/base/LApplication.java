package com.lwp.playapp.base;

import android.app.Application;
import android.content.Context;

import com.lwp.playapp.model.LoginBean;
import com.lwp.playapp.model.RegisterBean;


/**
 * author : lwp
 * date :2018/8/22
 * Email:1074762678@qq.com
 */
public class LApplication extends Application {

    public static LoginBean loginBean;

    public  static RegisterBean registerBean;

    private  static LApplication instance;



    public static Context getContext(){
        return LApplication.getContext();
    }

    public static LApplication getApp(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

}
