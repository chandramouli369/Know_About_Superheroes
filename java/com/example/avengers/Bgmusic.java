package com.example.avengers;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class Bgmusic extends AppCompatActivity {
private TextView text1;
private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bgmusic);
        text1=findViewById(R.id.text1);
        mediaPlayer=MediaPlayer.create(Bgmusic.this,R.raw.marvel_avengers);
        mediaPlayer.setLooping(true);
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