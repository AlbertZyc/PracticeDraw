package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            paint.setColor(Color.argb(255,34,150,243));
            paint.setStyle(Paint.Style.FILL);
            canvas.drawArc(150,150,600,600,70,110,true,paint);

            paint.setColor(Color.argb(255,0,150,136));
            canvas.drawArc(150,150,600,600,30,37,true,paint);

            paint.setColor(Color.argb(255,158,158,158));
            canvas.drawArc(150,150,600,600,15,13,true,paint);
//
            paint.setColor(Color.argb(255,156,39,176));
            canvas.drawArc(150,150,600,600,2,10,true,paint);
//
            paint.setColor(Color.argb(255,255,193,0));
            canvas.drawArc(150,150,600,600,0,-60,true,paint);

            paint.setColor(Color.argb(255,244,66,53));
            canvas.drawArc(130,130,580,580,180,120,true,paint);
            paint.setStrokeWidth(3);
            paint.setColor(Color.WHITE);
            float startX=(float) (355-225 * Math.cos(Math.toRadians(60)));
            float startY=(float) (355-225 * Math.sin(Math.toRadians(60)));
            canvas.drawLine(startX,startY,startX-30,startY-30 ,paint);
            paint.setStrokeWidth(30);
            canvas.drawPoint(startX,startY,paint);
        }
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
