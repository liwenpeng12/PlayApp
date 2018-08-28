package com.lwp.playapp.http;

import android.content.Context;

import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import com.franmontiel.persistentcookiejar.cache.SetCookieCache;
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor;
import com.lwp.playapp.base.LApplication;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author : lwp
 * date :2018/8/22
 * Email:1074762678@qq.com
 */
public class ApiService {

    //接口根地址
    public static final String BASE_URL = "http://www.wanandroid.com/";
    //设置超时时间
    private static final long DEFAULT_TIMEOUT = 10_000L;

    private Retrofit retrofit;
    private OkHttpClient client;



    private static class SingletonHolder {
        private static final ApiService INSTANCE = new ApiService();
    }

    //私有化构造方法
    private ApiService() {
        client = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                .readTimeout(DEFAULT_TIMEOUT, TimeUnit.MILLISECONDS)
                //添加请求头
                //.addInterceptor(new HeaderInterceptor())
                //添加日志打印拦截器
                .addInterceptor(new RequestLogInterceptor())
                .cookieJar(new PersistentCookieJar(new SetCookieCache(),new SharedPrefsCookiePersistor(LApplication.getContext())))
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                //添加Gson解析
                .addConverterFactory(GsonConverterFactory.create())
                //添加rxjava
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static ApiService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //这里返回一个泛型类，主要返回的是定义的接口类
    public <T> T createService(Class<T> clazz) {
        return retrofit.create(clazz);
    }
}


