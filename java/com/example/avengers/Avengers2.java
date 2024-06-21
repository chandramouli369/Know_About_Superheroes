package com.example.avengers;
import android.app.AlertDialog;
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

public class Avengers2 extends AppCompatActivity {
    GridLayout gridLayout;
    private TextView text1;
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avengers2);
        gridLayout=(GridLayout)findViewById(R.id.mainGrid2);

        setSingleEvent(gridLayout);
        ImageButton button = (ImageButton) findViewById(R.id.img3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Avengers2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            if(i==0) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, Tony.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==1) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, cap.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==2) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, hulk.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==3) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, thor1.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==4) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, black.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==5) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, clint2.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==6) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, Strange.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==7) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Avengers2.this, wanda.class);
                        startActivity(intent);
                    }
                });
            }
        }
    }
}