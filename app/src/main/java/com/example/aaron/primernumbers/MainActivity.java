package com.example.aaron.primernumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText firstNumberText;
    EditText secondNumberText;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberText = ((EditText) findViewById(R.id.fisrtNumber));
        secondNumberText = ((EditText) findViewById(R.id.secondNumber));
        result = ((TextView) findViewById(R.id.result));
    }


    public void getPrimes(View view) {

        if(!firstNumberText.getText().toString().isEmpty() && !secondNumberText.getText().toString().isEmpty()){
            double numberA = Double.parseDouble(firstNumberText.getText().toString());
            double numberB = Double.parseDouble(secondNumberText.getText().toString());

            if(numberA <= numberB){
                calcultaePrimeNumbers(numberA, numberB);
            }
            else{
                calcultaePrimeNumbers(numberB, numberA);
            }
        }
        else{
            Toast.makeText(this, "One or both or your text fields are blank", Toast.LENGTH_SHORT);
        }

    }

    public void calcultaePrimeNumbers(double ad, double bd){
        int n1 = new Double(ad).intValue();
        int n2 = new Double(bd).intValue();

        int flag = 0;
        String r = new String("");

        while (n1 < n2)
        {
            flag=0;

            for(int i = 2; i<n1; i++)
            {
                if(n1%i == 0)
                {
                    flag=1;
                    break;
                }
            }

            if (flag == 0){
                //print number n1
                r = r + n1 + " ";
            }

            n1++;
        }

        result.setText(r);
    }
}
