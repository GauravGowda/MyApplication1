package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onclickListner(View view) {
        Toast.makeText(this, "logging in", Toast.LENGTH_SHORT).show();
    }

    public void onclickHandler(View view) {
        Toast.makeText(this, "logged in", Toast.LENGTH_SHORT).show();
    }
}