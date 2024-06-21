package com.example.avengers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class Gridtrail extends AppCompatActivity {
    GridLayout gridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridtrail);
        gridLayout=(GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(gridLayout);
    }
    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            if(i==0) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, Tony.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==1) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, cap.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==2) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, hulk.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==3) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, thor1.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==4) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, black.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==5) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, clint2.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==6) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, Strange.class);
                        startActivity(intent);
                    }
                });
            }
            if(i==7) {
                cardView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Intent intent = new Intent(Gridtrail.this, wanda.class);
                        startActivity(intent);
                    }
                });
            }
        }
    }
}