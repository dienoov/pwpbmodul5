package com.kue.cubit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Singup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
    }

    public void daftarin(View view) {
        Intent i = new Intent(Singup.this, Daftarin.class);

        EditText mail = findViewById(R.id.mail);
        i.putExtra("mail", mail.getText().toString());

        EditText tetel = findViewById(R.id.tetel);
        i.putExtra("tetel", tetel.getText().toString());

        startActivity(i);
    }
}