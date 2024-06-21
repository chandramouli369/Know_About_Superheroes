package com.example.avengers;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout gridLayout;
    private TextView text1;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridLayout=(GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(gridLayout);
//       mediaPlayer= MediaPlayer.create(MainActivity.this,R.raw.infinity_war);
//        mediaPlayer.setLooping(true);
//        mediaPlayer.start();
        ImageButton button1 = (ImageButton) findViewById(R.id.img1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Homepagefinal.class);
                startActivity(intent);
            }
        });
        ImageButton button = (ImageButton) findViewById(R.id.img2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Avengers2.class);
                startActivity(intent);
            }
        });
    }
//    @Override
//    public void onResume()
//    {
//        super.onResume();
//    }
//    @Override
//    public void onPause()
//    {
//        super.onPause();
//
//    }
//    @Override
//    public void onDestroy() {
//
//        super.onDestroy();
//        android.os.Process.killProcess(android.os.Process.myPid());
//        mediaPlayer.stop();
//        mediaPlayer.release();
//    }

    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            if(i==0) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, Tony.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==1) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, cap.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==2) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, hulk.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==3) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, thor1.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==4) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, black.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==5) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, clint2.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==6) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, Strange.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==7) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(MainActivity.this, wanda.class);
                        startActivity(intent);
                    }
                });
            }
        }
    }
}