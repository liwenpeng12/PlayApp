package com.lwp.playapp.presenter;

import android.content.Context;

import com.lwp.playapp.base.BasePresenter;
import com.lwp.playapp.base.BaseView;
import com.lwp.playapp.http.Api;
import com.lwp.playapp.http.ApiService;
import com.lwp.playapp.model.RegisterBean;
import com.lwp.playapp.view.RegisterView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class RegisterPresenter extends BasePresenter<RegisterView> {
    public RegisterPresenter(RegisterView mView, Context context) {
        super(mView, context);
    }

    public void register(String username,String password,String repassword) {
        mView.showLoadingDialog();
        addSubscribe(ApiService.getInstance().createService(Api.class).getRegister(username,password,repassword).
                subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<RegisterBean>() {
            @Override
            public void accept(RegisterBean registerBean) throws Exception {
                if (null !=registerBean){
                    mView.closeLoadingDialog("操作成功");
                    mView.onRegisterSuccess(registerBean);
                }else {
                    mView.closeLodingFail("未能成功");
                }

            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mView.closeLodingFail("操作失败");
                mView.onRegisterFail(throwable.getMessage());
            }
        }));
    }
}
