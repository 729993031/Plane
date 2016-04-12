package com.example.Plane;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016/4/12.
 */
public class PlainView extends View {
    public float currentX;
    public float currentY;
    Bitmap bitmap;
    public PlainView(Context context)
    {
        super(context);
        bitmap= BitmapFactory.decodeResource(context.getResources(),
                R.drawable.plane);
        setFocusable(true);
    }
    @Override
    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Paint p=new Paint();
        canvas.drawBitmap(bitmap,currentX,currentY,p);
    }
}
