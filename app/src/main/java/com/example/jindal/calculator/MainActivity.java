package com.example.jindal.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText operend1;
    private EditText operend2;
    private Button btnaddition;
    private Button btnsubtraction;
    private Button btnmultiplication;
    private Button btndivision;
    private Button btnClear;
    private TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operend1 = (EditText) findViewById(R.id.operend1);
        operend2 = (EditText) findViewById(R.id.operend2);
        btnaddition = (Button) findViewById(R.id.btnaddition);
        btnsubtraction = (Button) findViewById(R.id.btnsubtraction);
        btnmultiplication = (Button) findViewById(R.id.btnmultiplication);
        btndivision = (Button) findViewById(R.id.btndivision);
        btnClear=(Button)findViewById(R.id.btnClear) ;
        txtresult = (TextView) findViewById(R.id.txtresult);

        btnaddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operend1.getText().length()>0&& operend2.getText().length()>0) {
                    double oper1 = Double.parseDouble(operend1.getText().toString());
                    double oper2 = Double.parseDouble(operend2.getText().toString());
                    double result = oper1 + oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this,"Enter The No In Both Fields",Toast.LENGTH_LONG).show();
                }
            }

        });
        btnsubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operend1.getText().length() > 0 && operend2.getText().length() > 0) {
                    double oper1 = Double.parseDouble(operend1.getText().toString());
                    double oper2 = Double.parseDouble(operend2.getText().toString());
                    double result = oper1 - oper2;
                    txtresult.setText(Double.toString(result));
                } else {
                    Toast.makeText(MainActivity.this,"Enter The No In Both Fields",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnmultiplication.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (operend1.getText().length() > 0 && operend2.getText().length() > 0) {
                double oper1 = Double.parseDouble(operend1.getText().toString());
                double oper2 = Double.parseDouble(operend2.getText().toString());
                double result = oper1 * oper2;
                txtresult.setText(Double.toString(result));
            }
                else {
                    Toast.makeText(MainActivity.this,"Enter The No In Both Fields",Toast.LENGTH_LONG).show();
                }
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operend1.getText().length() > 0 && operend2.getText().length() > 0) {
                double oper1 = Double.parseDouble(operend1.getText().toString());
                double oper2 = Double.parseDouble(operend2.getText().toString());
                double result = oper1 / oper2;
                txtresult.setText(Double.toString(result));
            }
                else {
                    Toast.makeText(MainActivity.this,"Enter The No In Both Fields",Toast.LENGTH_LONG).show();
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operend1.setText("");
                operend2.setText("");
                txtresult.setText("0.00");
                operend1.requestFocus();

            }
        });

    }
}
