package com.lwp.playapp.adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.hanks.htextview.evaporate.EvaporateTextView;
import com.hanks.htextview.fall.FallTextView;
import com.lwp.playapp.R;
import com.lwp.playapp.model.ArticalBean;

import java.util.List;

/**
 * author : lwp
 * date :2018/8/28
 * Email:1074762678@qq.com
 */
public class MainRvAdapter extends BaseMultiItemQuickAdapter<ArticalBean.DataBean.DatasBean,BaseViewHolder> {

    private Context mContext;

    public MainRvAdapter(List<ArticalBean.DataBean.DatasBean> data,Context context) {
        super(data);
        this.mContext = context;
        addItemType(0, R.layout.item_artical_rv_no_pic);
        addItemType(1, R.layout.item_artical_rv_one_pic);
    }

    @Override
    protected void convert(BaseViewHolder helper, ArticalBean.DataBean.DatasBean item) {
        switch (helper.getItemViewType()){
            case 0:

                TextView evaporateTextView = helper.getView(R.id.etv_title);
                evaporateTextView.setText(item.getTitle());

                helper.setText(R.id.tv_chaptername,item.getChapterName());

                helper.setText(R.id.tv_author,item.getAuthor());

                helper.setText(R.id.tv_time,String.valueOf(item.getNiceDate()));

                break;
            case 1:

                TextView fallTextView = helper.getView(R.id.ftv_title);
                fallTextView.setText(item.getTitle());

                helper.setText(R.id.tv_chaptername,item.getChapterName());

                helper.setText(R.id.tv_time,String.valueOf(item.getNiceDate()));

                ImageView iv_header = helper.getView(R.id.iv_env);
                Glide.with(mContext).load(item.getEnvelopePic()).into(iv_header);
                break;
        }
    }
}
