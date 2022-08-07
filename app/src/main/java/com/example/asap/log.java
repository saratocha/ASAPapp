package com.example.asap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class log extends AppCompatActivity {
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        TextView username =(TextView) findViewById(R.id.email);
        TextView password =(TextView) findViewById(R.id.password);

        button = (Button) findViewById(R.id.loginbtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("upskill@gmail.com") && password.getText().toString().equals("12345678")) {
                    Toast.makeText(getApplicationContext()
                            , "Form Validate Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(log.this, lista.class);
                    startActivity(intent);
                    return;
                }

                Toast.makeText(getApplicationContext()
                        , "Validation Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}