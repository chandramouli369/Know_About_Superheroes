package com.example.avengers;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private TextView text1;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Splash.this,Homepagefinal.class);
                startActivity(i);
                finish();
            }
        }, 12000);
        mediaPlayer= MediaPlayer.create(Splash.this,R.raw.avengers);
        //mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
    @Override
    public void onResume()
    {
        super.onResume();
    }
    @Override
    public void onPause()
    {
        super.onPause();

    }
    @Override
    public void onDestroy() {

        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }



    }
