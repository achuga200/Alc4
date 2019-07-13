package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =  findViewById(R.id.my_profile_button);
    }
    public void about(View view) {
        Intent aboutAlc = new Intent(MainActivity.this, about_alc.class);
        startActivity(aboutAlc);

    }

    public void profile(View view) {
        Intent intent = new Intent(MainActivity.this, profile_activity.class);
        startActivity(intent);
    }
}
