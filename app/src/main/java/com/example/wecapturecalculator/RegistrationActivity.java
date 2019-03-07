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
        final EditText email=findViewById(R.id.email);
        final EditText password=findViewById(R.id.password);


        Button registration=findViewById(R.id.registration);

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NewUser newuser = new NewUser(username.getText().toString(), email.getText().toString(), password.getText().toString());
                username.setError(null);

                if (!Validation.isValidCredentials(newuser.getUsername()))
                {
                    username.setError(getResources().getString(R.string.invalid_username));
                    username.requestFocus();
                }
                else {
                    if (!Validation.isValidCredentialsEmail(newuser.getEmail()))
                    {
                            email.setError(getResources().getString(R.string.invalid_email));
                            email.requestFocus();
                    }
                    else{
                            if (!Validation.isValidCredentials(newuser.getPassword()))
                            {
                                password.setError(getResources().getString(R.string.invalid_password));
                                password.requestFocus();
                            }
                            else{

                                Toast.makeText(RegistrationActivity.this,
                                        newuser.getUsername() + "\n" + newuser.getEmail() + "\n" + newuser.getPassword(),
                                        Toast.LENGTH_SHORT).show();
                                //                                                          Is kur               I kur
                                Intent goToLoginActivity = new Intent(RegistrationActivity.this, LoginActivity.class);
                                startActivity(goToLoginActivity);
                                }
                        }
                    }
            }
        });
    }
}