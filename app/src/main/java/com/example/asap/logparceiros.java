package com.example.asap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class logparceiros extends AppCompatActivity {
public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logparceiros);

        TextView username =(TextView) findViewById(R.id.email);
        TextView password =(TextView) findViewById(R.id.password);

        button = (Button) findViewById(R.id.loginbtnparc);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("sharksurf@gmail.com") && password.getText().toString().equals("sharksurf")) {
                    Toast.makeText(getApplicationContext()
                            , "Form Validate Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(logparceiros.this, parceiros.class);
                    startActivity(intent);
                    return;
                }

                Toast.makeText(getApplicationContext()
                        , "Validation Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
