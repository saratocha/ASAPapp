package com.example.asap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import  android.view.View;

public class lista extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        button = (Button) findViewById(R.id.schedule);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(lista.this,marcar.class);
                startActivity(intent);
            }
        });
        button = (Button) findViewById(R.id.schedule2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(lista.this,marcar2.class);
                startActivity(intent);
            }
        });

    }
}