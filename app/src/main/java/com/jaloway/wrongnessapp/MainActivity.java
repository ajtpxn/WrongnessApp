package com.jaloway.wrongnessapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void showWrongness(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageResource(R.drawable.wrong);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
