package com.example.simplecal1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class creditsForAlbert extends AppCompatActivity {
    TextView textView;
    float lastResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits_for_albert);

        textView = findViewById(R.id.textView);

        lastResult = getIntent().getFloatExtra("lastResult", 0);
        textView.setText("Last Result: " + lastResult);
    }


    public void backtododge(View view) {
        finish();
    }
}