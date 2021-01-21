package com.kue.cubit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilPilkades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_pilkades);

        String paslonA = getIntent().getExtras().getString("paslonA");
        String paslonB = getIntent().getExtras().getString("paslonB");

        int sekorPaslonA = Integer.parseInt(paslonA);
        int sekorPaslonB = Integer.parseInt(paslonB);

        TextView skor = findViewById(R.id.skor);
        TextView paslon = findViewById(R.id.paslon);

        if (sekorPaslonA > sekorPaslonB) {
            skor.setText(paslonA);
            paslon.setText("Paslon A");
        } else {
            skor.setText(paslonB);
            paslon.setText("Paslon B");
        }
    }
}