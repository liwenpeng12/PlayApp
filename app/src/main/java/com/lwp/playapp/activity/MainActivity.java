package com.lwp.playapp.activity;

import android.os.Bundle;

import com.lwp.playapp.R;
import com.lwp.playapp.base.BaseActivity;
import com.lwp.playapp.model.BannerBean;
import com.lwp.playapp.presenter.MainPresenter;
import com.lwp.playapp.util.GlideImageLoader;
import com.lwp.playapp.view.MainView;
import com.youth.banner.Banner;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */
public class MainActivity extends BaseActivity<MainPresenter> implements MainView {

    @BindView(R.id.banner)
    Banner banner;
    private List<String> imgPath;

    @Override
    protected void initPresenter() {
        mPresenter = new MainPresenter(this, this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mPresenter.getBanner();
    }

    @Override
    protected void initInjection() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void GetArticalSuccess() {

    }

    @Override
    public void GetArticalFail() {

    }

    @Override
    public void GetBannerSuccess(BannerBean bean) {
        List<BannerBean.DataBean> data = bean.getData();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            imgPath.add(data.get(i).getImagePath());
        }
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(imgPath);
        banner.start();
    }

    @Override
    public void GetBannerFail() {

    }


}
