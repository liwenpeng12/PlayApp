package com.lwp.playapp.base;

import android.content.Context;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class BasePresenter<V extends BaseView> {

    protected V mView;
    protected Context mContext;

    public CompositeDisposable mCompositeDisposable;

    public BasePresenter(V mView,Context context) {
        this.mView = mView;
        this.mContext = context;
    }

    public void addSubscribe(Disposable disposable){
        if (null == mCompositeDisposable){
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    public void detach(){
        mView =null;
        if ( null != mCompositeDisposable){
            mCompositeDisposable.clear();
        }
    }
}
