package com.lwp.playapp.base;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public interface BaseView {
    void showLoadingDialog();           //显示Dialog

    void closeLoadingDialog(String msg);          //关闭Dialog

    void closeLodingFail(String msg);           //失败
}
