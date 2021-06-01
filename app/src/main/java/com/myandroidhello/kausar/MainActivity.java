package com.myandroidhello.kausar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    Button btnFirst, btnSecond, btnCF, btnCS, btnCIV;
    ImageView iv,gif,iv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCF = findViewById(R.id.btnCF);
        btnCS = findViewById(R.id.btnCS);
        btnCIV = findViewById(R.id.btnCIV);
        gif = findViewById(R.id.gif);
        iv = (ImageView)findViewById(R.id.imageView3);
        iv1 = (ImageView)findViewById(R.id.imageView);

        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv.setVisibility(View.GONE);
                iv1.setVisibility(View.GONE);

                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.righttoleft);
                gif.startAnimation(animation);
                gif.setVisibility(View.VISIBLE);

            }
        });

        btnCS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gif.setVisibility(View.GONE);
                iv1.setVisibility(View.GONE);

                Animation animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.lefttoright);
                iv.startAnimation(animation);
                iv.setVisibility(View.VISIBLE);

            }
        });

        btnCIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gif.setVisibility(View.GONE);
                iv.setVisibility(View.GONE);

                Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.zoomin);
                //Animation animation2 = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                iv1.startAnimation(animation);
                //Thread.sleep(1000);
                //iv1.startAnimation(animation2);
                //Thread.sleep(1000);
                iv1.setVisibility(View.VISIBLE);

            }
        });


    }





}