package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaration
    EditText editTextNumber;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiating widgets
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        editTextNumber=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button2);

        //adding click event for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromGramToKilo();
            }
        });

    }

    private void ConvertFromGramToKilo() {
        String valueenterdinGram = editTextNumber.getText().toString();
        Double Gram = Double.parseDouble(valueenterdinGram);
        Double Kilo = Gram /1000;

        textView5.setText(""+Kilo);

    }




}

