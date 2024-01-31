package com.cloudpos.setwallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("ResourceType")
    public void setWp(View view) {
        //need permission :     <uses-permission android:name="android.permission.SET_WALLPAPER" />
        WallpaperManager mWallManager = WallpaperManager.getInstance(this);
        try {
            mWallManager.setResource(R.drawable.wp0605_1);
            Toast.makeText(this, "setWallpaper wp0605_1 success ", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "setWallpaper wp0605_1 failed", Toast.LENGTH_SHORT).show();
        }
    }
}
