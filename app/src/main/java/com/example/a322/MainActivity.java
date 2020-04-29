package com.example.a322;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewInputNumbers;
    private Button buttonChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textViewInputNumbers = findViewById(R.id.textViewInputNumbers);

        setCalcClickListener((TextView) findViewById(R.id.textViewButton0));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton1));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton2));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton3));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton4));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton5));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton6));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton7));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton8));
        setCalcClickListener((TextView) findViewById(R.id.textViewButton9));
        setCalcClickListener((TextView) findViewById(R.id.textViewButtonDot));

        TextView textViewButtonC = findViewById(R.id.textViewButtonC);
        textViewButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.setText("");

            }
        });


        TextView textViewButtonE1 = findViewById(R.id.textViewButtonE1);
        textViewButtonE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeVisibility();
            }
        });



    }

    private void setCalcClickListener(final TextView button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewInputNumbers.append(button.getText());
            }
        });
    }

    private void ChangeVisibility() {
        if (findViewById(R.id.r1).getVisibility() == View.VISIBLE) {
            findViewById(R.id.r1).setVisibility(View.GONE);
           } else {
            findViewById(R.id.r1).setVisibility(View.VISIBLE);
          }
    }
}