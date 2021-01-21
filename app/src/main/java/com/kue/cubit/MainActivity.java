package com.kue.cubit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void streamLur(View view) {
        Intent i = new Intent(MainActivity.this, Stream.class);
        startActivity(i);
    }

    public void masukin(View view) {
        Intent i = new Intent(MainActivity.this, Login.class);
        startActivity(i);
    }

    public void singUp(View view) {
        Intent i = new Intent(MainActivity.this, Singup.class);
        startActivity(i);
    }
}