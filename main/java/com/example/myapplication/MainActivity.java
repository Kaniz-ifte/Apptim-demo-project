package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonSet;
    private static final String APPTIM_EVENT = "APPTIM_EVENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        buttonSet = findViewById(R.id.buttonSet);
        Log.i(APPTIM_EVENT, "button-click-2, START");

        buttonSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("Button Clicked!");
            }
        });
        Log.i(APPTIM_EVENT, "button-click-2, STOP");

    }

}