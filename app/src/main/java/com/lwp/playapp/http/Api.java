package com.lwp.playapp.http;

import com.lwp.playapp.model.ArticalBean;
import com.lwp.playapp.model.BannerBean;
import com.lwp.playapp.model.LoginBean;
import com.lwp.playapp.model.RegisterBean;
import com.youth.banner.Banner;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * author : lwp
 * date :2018/8/22
 * Email:1074762678@qq.com
 */
public interface Api {

    //注册
    @FormUrlEncoded
    @POST("user/register")
    Observable<RegisterBean> getRegister(@Field("username") String username, @Field("password")String password ,
                                         @Field("repassword") String repassword);

    //登录
    @FormUrlEncoded
    @POST("user/login")
    Observable<LoginBean> getLogin(@Field("username") String username, @Field("password") String password);

    //banner
    @GET("banner/json")
    Observable<BannerBean> getBanner();

}
