package com.lwp.playapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lwp.playapp.R;
import com.lwp.playapp.adapter.MainRvAdapter;
import com.lwp.playapp.base.BaseActivity;
import com.lwp.playapp.model.ArticalBean;
import com.lwp.playapp.model.BannerBean;
import com.lwp.playapp.presenter.MainPresenter;
import com.lwp.playapp.util.Constant;
import com.lwp.playapp.util.GlideImageLoader;
import com.lwp.playapp.view.MainView;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
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

    @BindView(R.id.rv_main)
    RecyclerView mRvMain;

    private List<String> imgPath = new ArrayList<>();
    private List<String> titlePath = new ArrayList<>();
    private List<BannerBean.DataBean> data;

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
        mPresenter.getArtical(0);
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                startActivity(new Intent(MainActivity.this,WebViewActivity.class).
                        putExtra(Constant.URL,data.get(position).getUrl()));
            }
        });

    }

    @Override
    protected void initInjection() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void GetArticalSuccess(ArticalBean bean) {
        MainRvAdapter mainRvAdapter = new MainRvAdapter(bean.getData().getDatas(),this);
        mRvMain.setLayoutManager(new LinearLayoutManager(this));
        mRvMain.setAdapter(mainRvAdapter);
    }

    @Override
    public void GetArticalFail() {

    }

    @Override
    public void GetBannerSuccess(BannerBean bean) {
        data = bean.getData();
        int size = data.size();
        for (int i = 0; i < size; i++) {
            imgPath.add(data.get(i).getImagePath());
            titlePath.add(data.get(i).getTitle());
        }
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(imgPath);
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        banner.setBannerTitles(titlePath);
        banner.start();
    }

    @Override
    public void GetBannerFail() {

    }


}
