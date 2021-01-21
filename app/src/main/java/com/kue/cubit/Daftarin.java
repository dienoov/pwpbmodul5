package com.kue.cubit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Daftarin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftarin);

        String mail = getIntent().getExtras().getString("mail");
        String tetel = getIntent().getExtras().getString("tetel");

        TextView tampolMail = findViewById(R.id.mail);
        TextView tampolTetel = findViewById(R.id.tetel);

        tampolMail.setText(mail);
        tampolTetel.setText(tetel);
    }
}