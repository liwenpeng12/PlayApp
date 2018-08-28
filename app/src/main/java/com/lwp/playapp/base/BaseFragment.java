package com.lwp.playapp.base;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.lwp.playapp.widget.dialog.LoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements BaseView {
    protected Context mContext;
    private Unbinder bind;
    public P mPresenter;
    public LoadingDialog loadingDialog;
    private View mLayoutView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mLayoutView = inflater.inflate(getLayoutId(), null, false);
        mContext = getActivity();
        bind = ButterKnife.bind(this,mLayoutView);
        return mLayoutView;

    }

    @Override
    public void onStart() {
        super.onStart();
        initPresenter();
        initView();
        initData();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
                if (null != bind){
            bind.unbind();
        }
        if (null != loadingDialog){
            loadingDialog.dismiss();
        }
        if (null != mPresenter){
            mPresenter.detach();
        }
    }


    protected abstract void initPresenter();

    protected abstract void initData();

    protected abstract void initView();

    public void showToast(String toast){
        showToastShort(toast);
    }

    public void showToastShort(String msg){
        Toast.makeText(mContext,msg,Toast.LENGTH_SHORT).show();
    }

    public void showToasytLong(String msg){
        Toast.makeText(mContext, msg, Toast.LENGTH_LONG).show();
    }


    protected abstract void initInjection();

    public abstract int getLayoutId();


    @Override
    public void showLoadingDialog() {
        if (loadingDialog == null){
            loadingDialog = new LoadingDialog(mContext);
        }
        loadingDialog.show();
    }

    @Override
    public void closeLodingFail(final String msg) {
        getActivity().runOnUiThread(() -> {
            if (loadingDialog == null){
                loadingDialog = new LoadingDialog(mContext);
            }
            loadingDialog.dimissFail(msg);
        });
    }

    @Override
    public void closeLoadingDialog(final String msg) {
        getActivity().runOnUiThread(() -> {
            if (loadingDialog == null){
                loadingDialog = new LoadingDialog(mContext);
            }
            loadingDialog.dimissSuc(msg);
        });

    }
}
