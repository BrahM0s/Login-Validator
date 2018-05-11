package com.example.nsvr.loginvalidator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText editEmail, editPassword;
    Button button;
    String email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmail = (EditText) findViewById(R.id.input_email);
        editPassword = (EditText) findViewById(R.id.input_password);
        button = (Button) findViewById(R.id.signInButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = editEmail.getText().toString();
                password = editPassword.getText().toString();
                if (password.isEmpty() || email.isEmpty()) {
                    Toast.makeText(Login.this, "Fields cannot be Empty", Toast.LENGTH_LONG).show();
                } else if (!email.contains("@")) {
                    Toast.makeText(Login.this, "Please input a valid email", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Login.this, Display.class);
                    intent.putExtra("email", email);
                    intent.putExtra("password", password);
                    startActivity(intent);
                }
            }
        });
    }
}
