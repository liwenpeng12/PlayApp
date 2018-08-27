package com.lwp.playapp.view;

import com.lwp.playapp.base.BaseView;
import com.lwp.playapp.model.BannerBean;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public interface MainView extends BaseView{
    void GetArticalSuccess();
    void GetArticalFail();

    void GetBannerSuccess(BannerBean bannerBean);
    void GetBannerFail();
}
