package com.lwp.playapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.lwp.playapp.R;
import com.lwp.playapp.base.BaseActivity;
import com.lwp.playapp.base.LApplication;
import com.lwp.playapp.model.RegisterBean;
import com.lwp.playapp.presenter.RegisterPresenter;
import com.lwp.playapp.view.RegisterView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class RegisterActivity extends BaseActivity<RegisterPresenter> implements RegisterView{
    @BindView(R.id.et_apply_username)
    EditText etApplyUsername;
    @BindView(R.id.ll_apply_usernmae)
    LinearLayout llApplyUsernmae;
    @BindView(R.id.et_apply_password)
    EditText etApplyPassword;
    @BindView(R.id.ll_apply_password)
    LinearLayout llApplyPassword;
    @BindView(R.id.et_apply_repassword)
    EditText etApplyRepassword;
    @BindView(R.id.ll_apply_repassword)
    LinearLayout llApplyRepassword;
    @BindView(R.id.btn_commit_rogister)
    Button btnCommitRogister;

    private String password;
    private String username;
    private String repassword;


    @Override
    protected void initPresenter() {
        mPresenter = new RegisterPresenter(this,this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initInjection() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.acticvity_register;
    }


    @OnClick(R.id.btn_commit_rogister)
    public void onViewClicked() {
         username = etApplyUsername.getText().toString().trim();
         password = etApplyPassword.getText().toString().trim();
         repassword =etApplyRepassword.getText().toString().trim();
         if (isAllInfoNotEmpty(username) && isAllInfoNotEmpty(password) && isAllInfoNotEmpty(repassword)){
             mPresenter.register(username,password,repassword);
         }
    }

    public boolean isAllInfoNotEmpty(String msg){
        if (TextUtils.isEmpty(msg)){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public void onRegisterSuccess(RegisterBean bean) {
        LApplication.registerBean = bean;
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onRegisterFail(String msg) {

    }
}
