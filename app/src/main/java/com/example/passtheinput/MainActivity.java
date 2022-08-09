package com.example.passtheinput;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText emailTXT, passwordTXT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        emailTXT = findViewById(R.id.editTextTextEmailAddress);
        passwordTXT = findViewById(R.id.editTextNumberPassword);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailTXT.getText().toString();
                String password = passwordTXT.getText().toString();
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("EMAIL", email);
                i.putExtra("PASSWORD", password);
                startActivity(i);
            }
        });
    }
}