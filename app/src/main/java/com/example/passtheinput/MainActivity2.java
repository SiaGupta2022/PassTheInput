package com.example.passtheinput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1, txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txt1 = findViewById(R.id.textView2);
        txt2 = findViewById(R.id.textView3);
        String email, password;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras.getString("EMAIL") == null) {
                email = "Empty";
            } else {
                email = extras.getString("EMAIL");
            }
        } else {
            email = (String) savedInstanceState.getSerializable("EMAIL");
        }
        txt1.setText(email);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras.getString("PASSWORD") == null) {
                password = "Empty";
            } else {
                password = extras.getString("PASSWORD");
            }
        } else {
            password = (String) savedInstanceState.getSerializable("PASSWORD");
        }
        txt2.setText(password);
    }
}