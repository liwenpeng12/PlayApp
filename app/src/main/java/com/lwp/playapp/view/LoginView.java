package com.lwp.playapp.view;

import com.lwp.playapp.base.BaseView;
import com.lwp.playapp.model.LoginBean;
import com.lwp.playapp.model.RegisterBean;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public interface LoginView extends BaseView{
    void onLoginSuccess(LoginBean bean);
    void onLoginFail(String error);


}
