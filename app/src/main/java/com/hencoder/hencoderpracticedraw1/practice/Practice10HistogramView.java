package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Path path = new Path();
        paint.setStrokeWidth(5);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(100,100);
        path.lineTo(100,600);
        path.lineTo(1000,600);

        canvas.drawPath(path,paint);
        paint.setColor(Color.argb(255,153,204,51));
        paint.setStyle(Paint.Style.FILL);
        RectF rectF = new RectF();
        Random random = new Random();

        for(int i = 130 ; i < 800 ; i += 80){
            Log.i("Number" , ""+ i);
            int ranNumber =random.nextInt(600 - 10 + 1) + 10;
            rectF.left=i;
            rectF.right=i+60;
            rectF.top=ranNumber;
            rectF.bottom=600;
            canvas.drawRect(rectF,paint);

        }
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setColor(Color.WHITE);
        canvas.drawText("ABCG",130,620,paint);

//        canvas.drawText("AB",5);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
