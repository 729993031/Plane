package com.example.Plane;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.*;

public class MyActivity extends Activity {
    private int speed=10;


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final PlainView plainView=new PlainView(this);
        plainView.setBackgroundResource(R.drawable.back);
        WindowManager windowManager=getWindowManager();
        Display display=windowManager.getDefaultDisplay();
        DisplayMetrics metrics=new DisplayMetrics();
        display.getMetrics(metrics);
        plainView.currentX=metrics.widthPixels/2;
        plainView.currentY=metrics.heightPixels-40;
        plainView.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                switch (keyEvent.getKeyCode())
                {
                    case KeyEvent.KEYCODE_S:
                        plainView.currentY+=speed;
                        break;
                    case KeyEvent.KEYCODE_W:
                        plainView.currentY-=speed;
                        break;
                    case KeyEvent.KEYCODE_A:
                        plainView.currentY-=speed;
                        break;
                    case KeyEvent.KEYCODE_D:
                        plainView.currentY+=speed;
                        break;
                }
                plainView.invalidate();
                return true;
            }
        });

    }
}
