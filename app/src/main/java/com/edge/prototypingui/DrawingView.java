package com.edge.prototypingui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Matt on 1/31/16.
 */
class DrawingView extends View {
    String TAG = "Prototype";


    //END OF INTIALIZATION

    public DrawingView(Context context) {
        super(context);
        //initialize(context);
    }

    public DrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        //initialize(context);
    }

    public DrawingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //initialize(context);
    }

    //Initialize mainActivity and Paint objects
    /*public void initialize(Context context) {
        this.context = context;
        cardPaint = new Paint(Paint.DITHER_FLAG);
        tintPaint = new Paint();
        tintPaint.setColor(0x99000000);
        placeCardPaint = new Paint();
        placeCardPaint.setColor(0x992196F3);
        highlightPaint = new Paint();
        highlightPaint.setColor(0x99EEFF41);
        textPaint = new Paint();
        textPaint.setColor(0xFF000000);
        textPaint.setTextSize(cardWidth);
        mainActivity = (MainActivity) context;
        configureDisplay();
    }*/

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(0xFFFFFF00);


    }





    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN: {

            }
        }
        return true;
    }


}
