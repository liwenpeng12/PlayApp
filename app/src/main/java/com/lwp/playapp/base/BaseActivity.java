package com.lwp.playapp.base;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.lwp.playapp.widget.dialog.LoadingDialog;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public abstract class BaseActivity<P extends  BasePresenter> extends AppCompatActivity implements BaseView{

    protected Context mContext;
    private Unbinder bind;
    public P mPresenter;
    public LoadingDialog loadingDialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initStatusBar();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(getLayoutId());
        bind = ButterKnife.bind(this);
        mContext = this;
        initPresenter();
        initView();
        initData();
    }

    @Override
    protected void onDestroy() {
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

    /**
     * 一体化状态栏
     * */
    public void initStatusBar(){
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public void showLoadingDialog() {
        if (loadingDialog == null){
            loadingDialog = new LoadingDialog(this);
        }
        loadingDialog.show();
    }

    @Override
    public void closeLodingFail(final String msg) {
        runOnUiThread(() -> {
            if (loadingDialog == null){
                loadingDialog = new LoadingDialog(this);
            }
            loadingDialog.dimissFail(msg);
        });
    }

    @Override
    public void closeLoadingDialog(final String msg) {
        runOnUiThread(() -> {
            if (loadingDialog == null){
                loadingDialog = new LoadingDialog(this);
            }
            loadingDialog.dimissSuc(msg);
        });

    }

}
