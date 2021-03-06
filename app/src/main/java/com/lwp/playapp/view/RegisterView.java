package com.lwp.playapp.view;

import com.lwp.playapp.base.BaseView;
import com.lwp.playapp.model.RegisterBean;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public interface RegisterView extends BaseView {
    void onRegisterSuccess(RegisterBean bean);
    void onRegisterFail(String msg);
}
