package com.example.wecapturecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText username=findViewById(R.id.username);
        final EditText password=findViewById(R.id.password);
        final EditText email=findViewById(R.id.email);

        Button registration=findViewById(R.id.registration);

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewUser newuser = new NewUser(username.getText().toString(), email.getText().toString(), password.getText().toString());
                Toast.makeText(RegistrationActivity.this,
                        newuser.getUsername()+"\n"+newuser.getEmail()+"\n"+newuser.getPassword(),
                        Toast.LENGTH_SHORT).show();
                //                                                  Is kur               I kur
                Intent goToSearchActivity = new Intent(RegistrationActivity.this, SearchActivity.class);
                startActivity(goToSearchActivity);
            }
        });
    }
}