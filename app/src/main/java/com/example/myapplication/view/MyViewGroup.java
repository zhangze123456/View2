package com.example.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by ${张则} on 2021/6/27.
 * E-mail：1731498236@qq.com
 * 类描述：垂直的缩进 VIEWGroup
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
class MyViewGroup extends ViewGroup {


    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //1.测量自身
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //2.为每个子View计算测量的限制信息
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
