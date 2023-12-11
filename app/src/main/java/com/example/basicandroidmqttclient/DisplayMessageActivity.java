package com.example.basicandroidmqttclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void goToMainActivity(View view) {
        // Implement logic to go back to MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}