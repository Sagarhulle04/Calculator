package com.example.mycalculator;

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
    String temp,res;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });
            Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
            TextView e;
            b1=findViewById(R.id.button);
            b2=findViewById(R.id.button2);
            b3=findViewById(R.id.button3);
            b4=findViewById(R.id.button4);
            b5=findViewById(R.id.button5);
            b6=findViewById(R.id.button6);
            b7=findViewById(R.id.button7);
            b8=findViewById(R.id.button8);
            b9=findViewById(R.id.button9);
            b10=findViewById(R.id.button10);
            b11=findViewById(R.id.button11);
            b12=findViewById(R.id.button12);
            b13=findViewById(R.id.button13);
            b14=findViewById(R.id.button14);
            b15=findViewById(R.id.button15);
            b16=findViewById(R.id.button16);
            e=findViewById(R.id.textView2);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"1");

                }
            });
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"2");

                }
            });
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"3");

                }
            });
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"4");

                }
            });
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"5");

                }
            });
            b6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"6");

                }
            });
            b7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"7");

                }
            });
            b8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"8");

                }
            });
            b9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"9");

                }
            });
            b10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText(e.getText().toString()+"0");

                }
            });
            b11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    temp=e.getText().toString();
                    e.setText("");
                    id=1;
                }
            });
            b12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    temp=e.getText().toString();
                    e.setText("");
                    id=2;
                }
            });
            b13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    temp=e.getText().toString();
                    e.setText("");
                    id=3;
                }
            });
            b14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    temp=e.getText().toString();
                    e.setText("");
                    id=4;
                }
            });
            b15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    e.setText("");
                }
            });
            b16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(id)
                    {
                        case 1: {
                            res = e.getText().toString();
                            int n = Integer.parseInt(temp) * Integer.parseInt(res);
                            e.setText(Integer.toString(n));
                            break;
                        }
                        case 2: {
                            res = e.getText().toString();
                            int n = Integer.parseInt(temp) - Integer.parseInt(res);
                            e.setText(Integer.toString(n));
                            break;
                        }
                        case 3: {
                            res = e.getText().toString();
                            int n = Integer.parseInt(temp) + Integer.parseInt(res);
                            e.setText(Integer.toString(n));
                            break;
                        }
                        case 4: {
                            res = e.getText().toString();
                            double n = Double.parseDouble(temp) / Double.parseDouble(res);
                            e.setText(Double.toString(n));
                            break;
                        }
                    }
                }
            });

    }
}