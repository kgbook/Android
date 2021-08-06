package com.example.mycanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/** reference: https://examples.javacodegeeks.com/android/core/graphics/canvas-graphics/android-canvas-example/ */
public class MyView extends View {
    private Path mPath;
    private Paint mPaint;
    private float mX, mY;

    public MyView(Context c, AttributeSet attrs) {
        super(c, attrs);

        mPath = new Path();

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeWidth(20f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(mPath, mPaint);
        Log.d(getClass().getSimpleName(), "[onDraw]");
    }

    private void startTouch(float x, float y) {
        mPath.moveTo(x, y);
        mX = x;
        mY = y;
        Log.d(getClass().getSimpleName(), String.format("[startTouch]%.2f, %.2f", x, y));
    }

    private void moveTouch(float x, float y) {
        mPath.quadTo((x + mX) / 2, (y + mY) / 2, x, y);
        mX = x;
        mY = y;
        Log.d(getClass().getSimpleName(), String.format("[moveTouch]%.2f, %.2f", x, y));
    }

    private void upTouch() {
        mPath.lineTo(mX, mY);
        Log.d(getClass().getSimpleName(), String.format("[upTouch]%.2f, %.2f", mX, mY));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        Log.d(getClass().getSimpleName(), String.format("[onTouchEvent]action:%d, %.2f, %.2f", event.getAction(), x, y));
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startTouch(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                moveTouch(x, y);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                upTouch();
                invalidate();
                break;
        }
        return true;
    }

    public void clearCanvas() {
        mPath.reset();
        invalidate();
        Log.d(getClass().getSimpleName(), "[clearCanvas]");
    }
}
