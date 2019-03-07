package com.example.wecapturecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username=findViewById(R.id.username);
        final EditText password=findViewById(R.id.password);
        Button login=findViewById(R.id.login);
        Button registration=findViewById(R.id.registration);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(username.getText().toString(), password.getText().toString());
                if (!Validation.isValidCredentials(user.getUsername()) || !Validation.isValidCredentials(user.getPassword())){
                    Toast.makeText(LoginActivity.this,
                            getResources().getString(R.string.login_invalid_credentials),
                            Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(LoginActivity.this,
                            getResources().getString(R.string.login_invalid_credentials),
                            Toast.LENGTH_SHORT).show();

                Toast.makeText(LoginActivity.this,
                        user.getUsername()+"\n"+user.getPassword(),
                        Toast.LENGTH_SHORT).show();
                //                                                  Is kur               I kur
                Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);
                startActivity(goToSearchActivity);
            }
        });

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //                                                  Is kur               I kur
                Intent goToRegistrationActivity = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(goToRegistrationActivity);
            }
        });
    }
}