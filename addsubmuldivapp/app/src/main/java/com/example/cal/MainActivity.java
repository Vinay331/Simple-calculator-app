package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.result);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);

    }
    public void addNumber(View v)
    {
        double n1,n2,aresult;
        n1=Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        aresult=n1+n2;
        result.setText(String.valueOf(aresult));
    }
    public void subNumber(View v)
    {
        double n1,n2,aresult;
        n1=Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        aresult=n1-n2;
        result.setText(String.valueOf(aresult));
    }
    public void mulNumber(View v)
    {
        double n1,n2,aresult;
        n1=Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        aresult=n1*n2;
        result.setText(String.valueOf(aresult));
    }
    public void DivNumber(View v)
    {
        double n1,n2,aresult;
        n1=Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        aresult=n1/n2;
        result.setText(String.valueOf(aresult));
    }
}
