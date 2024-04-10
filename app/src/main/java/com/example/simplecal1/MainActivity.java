package com.example.simplecal1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {EditText currentNum;
    float num1, num2, lastResult;
    boolean plus, minus, mul, div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentNum = findViewById(R.id.currentNum);
    }

    public void plusDodge(View view) {
        if (canAct(currentNum.getText().toString())) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            plus = true;
        }
    }

    public void minusdodge(View view) {
        if (canAct(currentNum.getText().toString())) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            minus = true;
        }
    }

    public void muldodge(View view) {
        if (canAct(currentNum.getText().toString())) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            mul = true;
        }
    }

    public void divdodge(View view) {
        if (canAct(currentNum.getText().toString())) {
            num1 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");
            div = true;
        }
    }

    public void eqdodge(View view) {
        if (canAct(currentNum.getText().toString())) {
            num2 = Float.parseFloat(currentNum.getText().toString());
            currentNum.setText("");

            if (plus) {
                lastResult = num1+num2;
                currentNum.setHint(String.valueOf(num1 + num2));
                plus = false;
            }

            if (minus) {
                lastResult = num1-num2;
                currentNum.setHint(String.valueOf(num1 - num2));
                minus = false;
            }

            if (mul) {
                lastResult = num1*num2;
                currentNum.setHint(String.valueOf(num1 * num2));
                mul = false;
            }

            if (div) {
                if (num2 != 0) {
                    lastResult = num1/num2;
                    currentNum.setHint(String.valueOf(num1 / num2));
                } else {
                    Toast.makeText(this, "cant divide by zero", Toast.LENGTH_SHORT).show();
                }
                div = false;
            }
        }
    }

    public void resetdodge(View view) {
        currentNum.setText("");
        currentNum.setHint("Enter number");
    }

    public boolean canAct(String st) {
        if (st.isEmpty() || st.equals("-") || st.equals(".") || st.equals("+") || st.equals("-.") || st.equals("+.")) {
            Toast.makeText(this, "Invalid input", Toast.LENGTH_LONG).show();
            return false;
        } else {
            return true;
        }
    }

    public void creditsdodge(View view) {
        Intent intent = new Intent(this, creditsForAlbert.class);
        intent.putExtra("lastResult", lastResult);

        startActivity(intent);
    }
}
