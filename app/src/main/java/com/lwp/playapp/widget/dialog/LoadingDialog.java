package com.lwp.playapp.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.lwp.playapp.R;

/**
 * author : lwp
 * date :2018/8/27
 * Email:1074762678@qq.com
 */

public class LoadingDialog extends Dialog {

    private ImageView mImageView;
    private TextView textView;
    private ProgressBar progressBar;

    private static final int LOAD_MSG = 0x001;
    private static final int LOAD_FAIL = 0x002;

    private Handler mHander = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case LOAD_MSG:
                    dismiss();
                    break;
                default:
                    dismiss();
                    break;
            }
        }
    };

    public LoadingDialog(@NonNull Context context) {
        super(context, R.style.myDialogTheme2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_dialog_layout);
        mImageView = (ImageView) findViewById(R.id.logding_img);
        textView = (TextView) findViewById(R.id.logding_tv);
        progressBar = (ProgressBar) findViewById(R.id.logding_loding);

    }

    @Override
    public void show() {
        super.show();
        if (textView != null) {
            textView.setText(R.string.loading);
            progressBar.setVisibility(View.VISIBLE);
            mImageView.setVisibility(View.GONE);
        }
    }

    /**
     * 加载完成
     */
    public void dimissSuc(String str) {
        if (progressBar == null){
            dismiss();
            return;
        }
        progressBar.setVisibility(View.GONE);
        mImageView.setVisibility(View.VISIBLE);
        textView.setText(str);
        mImageView.setImageResource(R.drawable.load_suc_icon);
//        dismiss();
        mHander.sendEmptyMessageDelayed(LOAD_MSG, 500);
    }

    /**
     * 加载失败
     */
    public void dimissFail(String str) {
        if (progressBar == null){
            dismiss();
            return;
        }
        progressBar.setVisibility(View.GONE);
        mImageView.setVisibility(View.VISIBLE);
        textView.setText(str);
        mImageView.setImageResource(R.drawable.load_fail_icon);
        mHander.sendEmptyMessageDelayed(LOAD_MSG, 500);
    }


}
