package com.lwp.playapp.presenter;

import android.content.Context;

import com.lwp.playapp.base.BasePresenter;
import com.lwp.playapp.http.Api;
import com.lwp.playapp.http.ApiService;
import com.lwp.playapp.model.LoginBean;
import com.lwp.playapp.model.RegisterBean;
import com.lwp.playapp.view.LoginView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class LoginPresenter extends BasePresenter<LoginView> {


    public LoginPresenter(LoginView mView, Context context) {
        super(mView, context);
    }

    public void login(String username, String password){
        mView.showLoadingDialog();
        addSubscribe(ApiService.getInstance().createService(Api.class).getLogin(username,password).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<LoginBean>() {
            @Override
            public void accept(LoginBean loginBean) throws Exception {
                if (null != loginBean.getData()){
                    mView.closeLoadingDialog("操作成功");
                    mView.onLoginSuccess(loginBean);
                }else {
                    mView.closeLodingFail("未能成功");
                }


            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mView.closeLodingFail("操作失败");
                mView.onLoginFail(throwable.getMessage());
            }
        }));
    }


}
