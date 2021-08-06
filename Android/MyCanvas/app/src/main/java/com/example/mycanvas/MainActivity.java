package com.example.mycanvas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private MyView myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myView = findViewById(R.id.MyCanvas);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.clear) {
            myView.clearCanvas();
        }
    }
}