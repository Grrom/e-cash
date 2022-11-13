package com.example.ecash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton btnSignin = findViewById(R.id.btn_signin);
        TextView tvMpin = findViewById(R.id.input_mpin);

        btnSignin.setOnClickListener(view->{

            if (String.valueOf(tvMpin.getText()).equals("1234")) {
                startActivity(new Intent(this, HomePage.class));
            }else{
                Toast.makeText(this, "Wrong MPIN please try again.", Toast.LENGTH_LONG).show();
            }

        });
    }
}