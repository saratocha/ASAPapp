package com.example.asap;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.content.Intent;
import  android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class register extends AppCompatActivity {
    public Button button;
    EditText username, phone, email, password, repassord;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = findViewById(R.id.username);
        phone = findViewById(R.id.phone);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        repassord = findViewById(R.id.repassword);

        button = (Button) findViewById(R.id.signupbtn);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        //username
        awesomeValidation.addValidation(this, R.id.username,

                RegexTemplate.NOT_EMPTY, R.string.invalid_name);
        //phone
        awesomeValidation.addValidation(this, R.id.phone
                , "[9]{1}[1-6]{1}[0-9]{7}$", R.string.invalid_phone);

        //email
        awesomeValidation.addValidation(this, R.id.email
                , Patterns.EMAIL_ADDRESS, R.string.invalid_email);
        //password
        awesomeValidation.addValidation(this, R.id.password
                , ".{6,}", R.string.invalid_password);
        //corfirmar password
        awesomeValidation.addValidation(this, R.id.repassword
                , R.id.password, R.string.invalid_repassword);

        //mudar de página ao clicar no botão
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (awesomeValidation.validate()) {
                    Toast.makeText(getApplicationContext()
                            , "Form Validate Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(register.this, log.class);
                    startActivity(intent);
                return;
                }

                Toast.makeText(getApplicationContext()
                        , "Validation Failed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}



