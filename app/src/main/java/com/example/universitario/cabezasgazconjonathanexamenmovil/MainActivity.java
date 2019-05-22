package com.example.universitario.cabezasgazconjonathanexamenmovil;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button cf;
    Button fc;
    Button ck;
    Button kc;
    Button mcm;
    Button cmm;
    Button cmp;
    Button pcm;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cf = findViewById(R.id.buttoncf);
        fc = findViewById(R.id.buttonfc);
        ck = findViewById(R.id.buttonck);
        kc = findViewById(R.id.buttonkc);
        mcm = findViewById(R.id.buttonmcm);
        cmm = findViewById(R.id.buttoncmm);
        cmp = findViewById(R.id.buttoncmp);
        pcm = findViewById(R.id.buttonpcm);

        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",cf.getText().toString());
                intent.putExtra("Operacion","1");
                startActivity(intent);
            }
        });

        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",fc.getText().toString());
                intent.putExtra("Operacion","2");
                startActivity(intent);
            }
        });


        ck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",ck.getText().toString());
                intent.putExtra("Operacion","3");
                startActivity(intent);
            }
        });

        kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",kc.getText().toString());
                intent.putExtra("Operacion","4");
                startActivity(intent);
            }
        });

        mcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",mcm.getText().toString());
                intent.putExtra("Operacion","5");
                startActivity(intent);
            }
        });

        cmm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",cmm.getText().toString());
                intent.putExtra("Operacion","6");
                startActivity(intent);
            }
        });

        cmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",cmp.getText().toString());
                intent.putExtra("Operacion","7");
                startActivity(intent);
            }
        });

        pcm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ConversorPart2.class).putExtra("Titulo",pcm.getText().toString());
                intent.putExtra("Operacion","8");
                startActivity(intent);
            }
        });

    }
}
