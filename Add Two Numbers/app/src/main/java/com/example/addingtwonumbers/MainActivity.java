package com.example.addingtwonumbers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Button btn = (Button) findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View view){
                    EditText f1 = (EditText) findViewById(R.id.num1);
                    EditText f2 = (EditText) findViewById(R.id.num2);

                    TextView res = (TextView) findViewById(R.id.output);

                    int sum = Integer.parseInt(f1.getText().toString())+Integer.parseInt(f2.getText().toString());

                    res.setText(sum +"");
                }
            });



        };
    }
