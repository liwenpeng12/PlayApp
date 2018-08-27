package com.lwp.playapp.presenter;

import android.content.Context;
import android.util.Log;

import com.lwp.playapp.base.BasePresenter;
import com.lwp.playapp.http.Api;
import com.lwp.playapp.http.ApiService;
import com.lwp.playapp.model.BannerBean;
import com.lwp.playapp.view.MainView;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class MainPresenter extends BasePresenter<MainView> {
    public MainPresenter(MainView mView, Context context) {
        super(mView, context);
    }
    public void getBanner(){
        mView.showLoadingDialog();
        addSubscribe(ApiService.getInstance().createService(Api.class).getBanner().subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<BannerBean>() {
            @Override
            public void accept(BannerBean bannerBean) throws Exception {
                if (null != bannerBean.getData()){
                    mView.GetBannerSuccess(bannerBean);
                    mView.closeLoadingDialog("操作成功");
                }else {
                    mView.closeLodingFail("未能成功");
                }
            }
        }, new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                mView.closeLodingFail("操作失败"+throwable.getMessage());
                Log.d("lwp","throwable:"+throwable.getMessage());
            }
        }));
    }

    public void getArtical(){

    }
}
