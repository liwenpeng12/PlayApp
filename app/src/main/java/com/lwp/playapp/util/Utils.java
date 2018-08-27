package com.lwp.playapp.util;

import android.content.Context;

import com.lwp.playapp.base.LApplication;

import io.reactivex.FlowableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class Utils {
    public static Context getContext(){
        return LApplication.getContext();
    }

    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
     */
    public static <T> FlowableTransformer<T, T> rxScheduler() {    //compose简化线程
        return observable -> observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
