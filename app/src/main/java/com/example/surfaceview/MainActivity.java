package com.example.surfaceview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MySV sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sv = new MySV(this);
        setContentView(sv);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sv.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        sv.pause();
    }
}
