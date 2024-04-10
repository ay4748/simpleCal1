package com.example.simplecal1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText currentNum;
    float num1, num2;
    boolean plus, minus, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentNum = findViewById(R.id.currentNum);
    }

    public void plusDodge(View view) {
        if (!currentNum.getText().toString().isEmpty()) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            plus = true;
        }
    }

    public void minusdodge(View view) {
        if (!currentNum.getText().toString().isEmpty()) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            minus = true;
        }
    }

    public void muldodge(View view) {
        if (!currentNum.getText().toString().isEmpty()) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            mul = true;
        }
    }

    public void divdodge(View view) {
        if (!currentNum.getText().toString().isEmpty()) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            div = true;
        }
    }

    public void eqdodge(View view) {
        if (!currentNum.getText().toString().isEmpty()) {
            num2 = Float.parseFloat(currentNum.getText().toString());

            if (plus) {
                currentNum.setHint(String.valueOf(num1 + num2));
                plus = false;
            }

            if (minus) {
                currentNum.setHint(String.valueOf(num1 - num2));
                minus = false;
            }

            if (mul) {
                currentNum.setHint(String.valueOf(num1 * num2));
                mul = false;
            }

            if (div) {
                if (num2 != 0) {
                    currentNum.setHint(String.valueOf(num1 / num2));
                } else {
                    Toast.makeText(this,"invalid input",Toast.LENGTH_LONG).show();
                }
                div = false;
            }
        }
    }

    public void resetdodge(View view) {
        currentNum.setText("");
    }
}
