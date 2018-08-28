package com.lwp.playapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.lwp.playapp.R;
import com.lwp.playapp.base.BaseActivity;
import com.lwp.playapp.base.LApplication;
import com.lwp.playapp.model.LoginBean;
import com.lwp.playapp.model.RegisterBean;
import com.lwp.playapp.presenter.LoginPresenter;
import com.lwp.playapp.util.Constant;
import com.lwp.playapp.util.SpUtils;
import com.lwp.playapp.view.LoginView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginView {
    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.ll_usernmae)
    LinearLayout llUsernmae;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.ll_password)
    LinearLayout llPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.btn_register)
    Button btnRegister;

    @Override
    protected void initPresenter() {
        mPresenter =new LoginPresenter(this,this);
    }

    @Override
    protected void initData() {
        String username = SpUtils.getString(mContext, Constant.USERNAME, "");
        String password = SpUtils.getString(mContext, Constant.PASSWORD, "");
        if (!isLEmpty(username) && !isLEmpty(password)){
            etUsername.setText(username);
            etPassword.setText(password);
            btnLogin.performClick();
        }
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initInjection() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onLoginSuccess(LoginBean bean) {
        LApplication.loginBean =bean;
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginFail(String error) {

    }



    @OnClick({R.id.btn_login, R.id.btn_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                String mUsername = etUsername.getText().toString().trim();
                String mPassword = etPassword.getText().toString().trim();
                mPresenter.login(mUsername,mPassword);
                break;
            case R.id.btn_register:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
        }
    }


}
