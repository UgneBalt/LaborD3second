package org.ugne.labord3second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {

    private TextView outputView;
    private String number="";
    private String operand1="";
    private String operation="";
    private Button buttonMC;
    private Button buttonMR;
    private Button buttonMS;
    private Button buttonMPlus;
    private Button buttonMMinus;
    private Button buttonLeft;
    private Button buttonCE;
    private Button buttonC;
    private Button buttonPlusMinus;
    private Button buttonSquare;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonDivide;
    private Button buttonProc;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button buttonMultiply;
    private Button button1x;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button buttonMinus;
    private Button buttonEqual;
    private Button button0;
    private Button buttonSpot;
    private Button buttonPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputView = findViewById(R.id.outputView);
        buttonMC = findViewById(R.id.buttonMC);
        buttonMR = findViewById(R.id.buttonMR);
        buttonMS = findViewById(R.id.buttonMS);
        buttonMPlus = findViewById(R.id.buttonMplius);
        buttonMMinus = findViewById(R.id.buttonMminus);
        buttonLeft = findViewById(R.id.buttonLeft);
        buttonCE = findViewById(R.id.buttonCE);
        buttonC = findViewById(R.id.buttonC);
        buttonPlusMinus = findViewById(R.id.buttonPlusMinus);
        buttonSquare = findViewById(R.id.buttonSquare);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonProc = findViewById(R.id.buttonProc);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        button1x = findViewById(R.id.button1x);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonEqual = findViewById(R.id.buttonEqual);
        button0 = findViewById(R.id.button0);
        buttonSpot = findViewById(R.id.buttonSpot);
        buttonPlus = findViewById(R.id.buttonPlus);

        outputView.setText("0");

        buttonMC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {


                operand1=number;
                number="";
                operation="/";
                outputView.setText(operand1+operation);
            }
        });
        buttonMR.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        buttonMS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        buttonMPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        buttonMMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        buttonLeft.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operation="←";
                number=number.substring (0,number.length()-1);
                outputView.setText(number);
            }
        });
        buttonCE.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number="";
                outputView.setText("0");
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number="";
                outputView.setText("0");
            }
        });
        buttonPlusMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=number;
                number="";
                operation="+-";
            }
        });
        buttonSquare.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=number;
                number="";
                operation="√";
                outputView.setText(operation+operand1);
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"7";
                outputView.setText(number);
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"8";
                outputView.setText(number);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"9";
                outputView.setText(number);
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=number;
                number="";
                operation="/";
                outputView.setText(operand1+operation);
            }
        });
        buttonProc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"4";
                outputView.setText(number);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"5";
                outputView.setText(number);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"6";
                outputView.setText(number);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=number;
                number="";
                operation="*";
                outputView.setText(operand1+operation);
            }
        });
        button1x.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=number;
                number="";
                operation="1x";
                outputView.setText(operand1+operation);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"1";
                outputView.setText(number);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"2";
                outputView.setText(number);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"3";
                outputView.setText(number);
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=number;
                number="";
                operation="-";
                outputView.setText(operand1+operation);
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (operation.equals("+"))
                {
                    double number1, number2;
                    number1=Double.parseDouble(operand1);
                    number2=Double.parseDouble(number);
                    number=Double.toString(number1+number2);
                    outputView.setText(number);
                }
                if (operation.equals("-"))
                {
                    double number1, number2;
                    number1=Double.parseDouble(operand1);
                    number2=Double.parseDouble(number);
                    number=Double.toString(number1-number2);
                    outputView.setText(number);
                }
                if (operation.equals("/"))
                {
                    double number1, number2;
                    number1=Double.parseDouble(operand1);
                    number2=Double.parseDouble(number);
                    if (number1==0)
                    {
                        Context context = getApplicationContext();
                        CharSequence text = "You cannot divide 0!";
                        int duration = Toast.LENGTH_LONG;

                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                    number=Double.toString(number1/number2);
                    outputView.setText(number);
                }
                if (operation.equals("*"))
                {
                    double number1, number2;
                    number1=Double.parseDouble(operand1);
                    number2=Double.parseDouble(number);
                    number=Double.toString(number1*number2);
                    outputView.setText(number);
                }
                if (operation.equals("1x"))
                {
                    double number1, number2=1;
                    number1 = Double.parseDouble(operand1);
                    number=Double.toString(number2/number1);
                    outputView.setText(number);
                }
                if (operation.equals("+-"))
                {
                    double number1, number2=0;
                    number1 = Double.parseDouble(operand1);
                    number=Double.toString(number2-number1);
                    outputView.setText(number);
                }
                if (operation.equals("√"))
                {
                    double number1;
                    number1=Double.parseDouble(operand1);
                    number=Double.toString(sqrt(number1));
                    outputView.setText(number);
                }
            }
        });
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                number=number+"0";
                outputView.setText(number);
            }
        });
        buttonSpot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                operand1=number;
                number="";
                operation="+";
                outputView.setText(operand1+operation);
            }
        });
    }
}