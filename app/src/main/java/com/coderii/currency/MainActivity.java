package com.coderii.currency;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private EditText input1;

    final Context context = this;
    private TextView tv_result;
    private TextView tv_result1;
    public double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        input1 = (EditText) findViewById(R.id.et_input1);

        Button bt_calculate = (Button) findViewById(R.id.bt_calculate);

        tv_result = (TextView) findViewById(R.id.tv_result);
       tv_result1 = (TextView) findViewById(R.id.tv_result1);




        bt_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(input1.getText().toString().isEmpty()) {
                    tv_result.setText("Data Incomplete");
                }




                else {
                    makeCalculations();
                }
            }
        });

    }

    private void makeCalculations() {
        // I'm assuming you're getting numbers.
        double n1 = Double.valueOf(input1.getText().toString());





//        // Do your calculation here.
//        // I'm assuming you have inserted the result on a variable called 'result'. Like: double result
//
result = n1*0.015;
//    result = result1;
        double result1=n1*0.0000014;




            tv_result.setText(n1 + " Rupees = "+ result +" Dollars" );
        tv_result1.setText(n1 + " Rupees = "+ result1 +" Bitcoins" );
        }
    }








