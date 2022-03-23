package com.example.seng405_assignment_1_loginpage_201928028;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//Hocam background image eklemeye calistigimda drawable klasorune bir fotograf atinca
//altini kirmizi ile ciziyor bu sorunu cozemedim

public class MainActivity extends AppCompatActivity {

    EditText emailText, passwordText;
    Button signIn,signUp,forgotPassword;
    public final String adminEmail = "admin@gmail.com";
    public final String adminPassword = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailText = (EditText) findViewById(R.id.editTextTextEmailAddress);
        passwordText = (EditText)  findViewById(R.id.editTextTextPassword);

        signIn = (Button) findViewById(R.id.signInbutton);
        signUp = (Button) findViewById(R.id.signUpbutton);
        forgotPassword = (Button) findViewById(R.id.forgotPasswordButton);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();

                if(email.equals(adminEmail) && password.equals(adminPassword)){
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    //Intent intent = new Intent(getApplicationContext())
                }

            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();

                if(email.contains("@") && !password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Signed up successfully!!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please type carefully", Toast.LENGTH_SHORT).show();
                }
            }
        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailText.getText().toString();

                if (email.contains("@")){
                    Toast.makeText(MainActivity.this, "Please check your email to reset your password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter your e-mail", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}