package com.example.myapplication.view;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ${张则} on 2021/6/26.
 * E-mail：1731498236@qq.com
 * 类描述：
 * 修改人：
 * 修改时间： Glide  onMeasure
 * TEL：18627795967
 */
public  class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    //测量 计算出view大小
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //1测量自身
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //为每个子view计算测量的限制 信息
        int widthMode=MeasureSpec.getMode(widthMeasureSpec);
        int widthMeasure=MeasureSpec.getSize(widthMeasureSpec);
        int heightMode=MeasureSpec.getMode(widthMeasureSpec);
        int heightMeasure=MeasureSpec.getSize(widthMeasureSpec);
    }

    //view在viewgroup位置

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    //绘制

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
