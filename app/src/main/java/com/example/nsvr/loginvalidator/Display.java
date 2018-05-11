package com.example.nsvr.loginvalidator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Button lolB = (Button) findViewById(R.id.lolB);

        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        TextView showEmail = (TextView) findViewById(R.id.show_email);
        TextView showPassword = (TextView) findViewById(R.id.show_password);

        showEmail.setText("Email: " + email);
        showPassword.setText("Password: " + password);

        lolB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Display.this, "That's all this App does! xD", Toast.LENGTH_LONG).show();
            }
        });

        lolB.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(Display.this, "What more do you want? xP", Toast.LENGTH_LONG).show();
                return false;
            }
        });

    }
}
