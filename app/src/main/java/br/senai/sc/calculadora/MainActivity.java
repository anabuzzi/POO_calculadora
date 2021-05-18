package br.senai.sc.calculadora;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView display;
    private TextView logDisplay;
    private int num1, num2 = 0;
    private float result = 0;
    private String operator;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Minha calculadora");
        display = findViewById(R.id.tv_display);
        logDisplay = findViewById(R.id.tv_logDisplay);

    }


    private void atualizarDisplay(String text) {
        String textDisplay = display.getText().toString();
        textDisplay = textDisplay + text;
        display.setText(textDisplay);

    }

    private void atualizarLog (String text) {
        String textDisplay = logDisplay.getText().toString();
        textDisplay = textDisplay + text;
        logDisplay.setText(textDisplay);

    }

    public void onClickButton1(View v) {

        atualizarDisplay("1");

    }

    public void onClickButton2(View v) {

        atualizarDisplay( "2");

    }

    public void onClickButton3(View v) {

        atualizarDisplay( "3");

    }

    public void onClickButton4(View v) {

        atualizarDisplay( "4");

    }

    public void onClickButton5(View v) {

        atualizarDisplay( "5");

    }

    public void onClickButton6(View v) {

        atualizarDisplay( "6");

    }

    public void onClickButton7(View v) {

        atualizarDisplay( "7");

    }

    public void onClickButton8(View v) {

        atualizarDisplay( "8");

    }

    public void onClickButton9(View v) {

        atualizarDisplay( "9");

    }

    public void onClickButton0(View v) {

        atualizarDisplay( "0");

    }

    public void onClickAdd(View v) {
        num1 = Integer.parseInt(display.getText().toString());
        display.setText(null);
        operator = "+";
        atualizarLog(String.valueOf(num1) + " " + operator);

    }

    public void onClickSub(View v) {
        num1 = Integer.parseInt(display.getText().toString());
        display.setText(null);
        operator = "-";
        atualizarLog(String.valueOf(num1) + " " + operator);
    }

    public void onClickMul(View v) {
        num1 = Integer.parseInt(display.getText().toString());
        display.setText(null);
        operator = "*";
        atualizarLog(String.valueOf(num1) + " " + operator);
    }

    public void onClickDiv(View v) {
        num1 = Integer.parseInt(display.getText().toString());
        display.setText(null);
        operator = "/";
        atualizarLog(String.valueOf(num1) + " " + operator);
    }

    public void onClickEqual(View v) {
        num2 = Integer.parseInt(display.getText().toString());
        atualizarLog( " " + String.valueOf(num2) + " = ");
        switch (operator){
            case "+":
                result = num1 + num2;
                display.setText(String.valueOf(result));
                break;
            case "-":
                result = num1 - num2;
                display.setText(String.valueOf(result));
                break;
            case "*":
                result = num1 * num2;
                display.setText(String.valueOf(result));
                break;
            case "/":
                if (num2 == 0) {
                    display.setTextSize(22);
                    display.setText("Não é possível dividir por zero");
                    break;
                }
                else result = num1 / num2;
                display.setText(String.valueOf(result));
                break;

        }


    }

}