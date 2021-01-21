package com.kue.cubit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CounterStrike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter_strike);
    }

    public void nambahSiji(View view) {
        setSekor(view, 1);
    }

    public void nambahLoro(View view) {
        setSekor(view, 2);
    }

    public void nambahTelu(View view) {
        setSekor(view, 3);
    }

    public void rese(View view) {
        TextView a = findViewById(R.id.sekorA);
        TextView b = findViewById(R.id.sekorB);

        a.setText("0");
        b.setText("0");
    }

    public void setSekor(View view, int sekor) {

        switch (view.getTag().toString()) {

            case "A":
                TextView a = findViewById(R.id.sekorA);
                sekor += Integer.parseInt(a.getText().toString());
                a.setText(String.valueOf(sekor));
                break;

            case "B":
                TextView b = findViewById(R.id.sekorB);
                sekor += Integer.parseInt(b.getText().toString());
                b.setText(String.valueOf(sekor));
                break;

        }

    }

    public void hasil(View view) {
        Intent i = new Intent(CounterStrike.this, HasilPilkades.class);

        TextView paslonA = findViewById(R.id.sekorA);
        TextView paslonB = findViewById(R.id.sekorB);

        i.putExtra("paslonA", paslonA.getText().toString());
        i.putExtra("paslonB", paslonB.getText().toString());

        startActivity(i);
    }
}