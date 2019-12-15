package com.example.michael.homework2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
        import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Michael on 2/3/2017.
 */

public class SnowmanView extends View {
    private Paint snowmanPaint;

    //Snowman Params
    float bottomx;
    float bottomy;
    float bottomSize;

    float middlex;
    float middley;
    float middleSize;

    float headx;
    float heady;
    float headSize;

    float scalar;

    int midScreeny;
    int midScreenx;

    public SnowmanView(Context context) {
        super(context);
        init();
    }

    public SnowmanView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        snowmanPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        int snowmanColor = Color.BLACK;
        snowmanPaint.setColor(snowmanColor);

        scalar = 1;

        //Initialize Snowman Params
//        midScreeny = this.getHeight()/2;
//        midScreenx = this.getWidth()/2;
//
//        bottomx = midScreenx;
//        bottomy = midScreeny + 50;
//        bottomSize = 30;
//
//        middlex = midScreenx;
//        middley = midScreeny;
//        middleSize = 20;
//
//        headx = midScreenx;
//        heady = midScreeny - 30;
//        headSize = 20;

        //create a few Paint objects

    }

    //Layout

    //Draw shapes
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //Initialize Snowman Params
        midScreeny = this.getHeight()/2;
        midScreenx = this.getWidth()/2;

        bottomx = midScreenx;
        bottomy = (midScreeny + 50) + scalar * 2;
        bottomSize = 30 + scalar;

        middlex = midScreenx;
        middley = midScreeny;
        middleSize = 20 + scalar;

        headx = midScreenx;
        heady = (midScreeny - 30) - scalar * 2;
        headSize = 10 + scalar;

        //Draw bottom
        canvas.drawCircle(bottomx, bottomy, bottomSize, snowmanPaint);
        Log.d("Values", "bottomx="+bottomx+"\nbottomy="+bottomy);

        //draw middle
        canvas.drawCircle(middlex, middley, middleSize, snowmanPaint);
        Log.d("Values", "middlex="+middlex+"\nmiddley="+middley);

        //draw head
        canvas.drawCircle(headx, heady, headSize, snowmanPaint);
        Log.d("Values", "headx="+headx+"\nheady="+heady);

    }

    public void setScalar(int num){
        scalar = scalar + num;
    }
}

