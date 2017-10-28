package com.example.happu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String Exp = "0", Ans = "0", num1 = " ", num2 = " ";
    char oprtors = ' ';
    private TextView pannelV, AnsView;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, EqulBtn, DelBtn, DecimalBtn;
    private Button PlusBtn, minusBtn, mulBtn, divBtn, clearbtn, AnsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pannelV = (TextView) findViewById(R.id.pannel);
        AnsView = (TextView) findViewById(R.id.AnsView);
        clearbtn = (Button) findViewById(R.id.Clear_btn);
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearAll();
            }
        });
        btn0 = (Button) findViewById(R.id.button0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp != "0")
                    Exp = Exp + "0";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "1";
                else
                    Exp = Exp + "1";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "2";
                else
                    Exp = Exp + "2";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "3";
                else
                    Exp = Exp + "3";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "4";
                else
                    Exp = Exp + "4";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "5";
                else
                    Exp = Exp + "5";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn6 = (Button) findViewById(R.id.button6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "6";
                else
                    Exp = Exp + "6";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "7";
                else
                    Exp = Exp + "7";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "8";
                else
                    Exp = Exp + "8";
                displayExp(Exp);
            }
        });
        btn9 = (Button) findViewById(R.id.button9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp == "0")
                    Exp = "9";
                else
                    Exp = Exp + "9";
                if (oprtors == ' ')
                    displayExp(Exp);
                else {
                    displayExp(num1 + oprtors + Exp);
                }
            }
        });
        EqulBtn = (Button) findViewById(R.id.button_eql);
        EqulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Exp;
                if (oprtors == '+') {
                    AddResults();
                } else if (oprtors == '-') {
                    MinusResults();
                } else if (oprtors == '*') {
                    Multiply();
                } else if (oprtors == '/') {
                    Division();
                } else ;
            }
        });
        DelBtn = (Button) findViewById(R.id.button_del);
        DelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Exp != "0" && Exp.length() >= 2) {
                    Exp = Exp.substring(0, Exp.length() - 1);
                } else {
                    Exp = "0";
                }
                displayExp(Exp);

            }
        });
        DecimalBtn = (Button) findViewById(R.id.decimal);
        DecimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (DecimalSearch()) {

                } else if (Exp.equals("0")) {
                    Exp = ".";
                } else {
                    Exp += ".";
                }
                displayExp(Exp);
            }
        });
        AnsBtn = (Button) findViewById(R.id.button_ans);
        AnsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnsView.setText(" ");
                Exp = Ans;
                num1 = "0";
                displayExp(Exp);
            }
        });
        PlusBtn = (Button) findViewById(R.id.buttonplus);
        PlusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnsView.setText(" ");
                if (oprtors != ' ') {
                    if (Exp != "0")
                        num1 = Exp;
                    else
                        num1 = Ans;
                } else
                    num1 = Exp;
                oprtors = '+';
                displayExp(num1 + "+");
                Exp = "0";
            }
        });
        minusBtn = (Button) findViewById(R.id.button_minus);
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnsView.setText(" ");
                if (oprtors != ' ') {
                    if (Exp != "0")
                        num1 = Exp;
                    else
                        num1 = Ans;
                } else
                    num1 = Exp;
                oprtors = '-';
                displayExp(num1 + "-");
                Exp = "0";

            }
        });
        mulBtn = (Button) findViewById(R.id.buttonx);
        mulBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnsView.setText(" ");
                if (oprtors != ' ') {
                    if (Exp != "0")
                        num1 = Exp;
                    else
                        num1 = Ans;
                } else
                    num1 = Exp;
                oprtors = '*';
                displayExp(num1 + "*");
                Exp = "0";
            }
        });
        divBtn = (Button) findViewById(R.id.button_div);
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnsView.setText(" ");
                if (oprtors != ' ') {
                    if (Exp != "0")
                        num1 = Exp;
                    else
                        num1 = Ans;
                } else
                    num1 = Exp;
                oprtors = '/';
                displayExp(num1 + "/");
                Exp = "0";
            }
        });


    }

    protected void clearAll() {
        Toast.makeText(MainActivity.this, "clear all", Toast.LENGTH_SHORT).show();
        Exp = "0";
        Ans = "0";
        num1 = "0";
        num2 = "0";
        oprtors = ' ';
        pannelV.setText(Exp);
        AnsView.setText(" ");
    }

    protected void displayExp(String print) {
        pannelV.setText(print);
    }

    protected boolean DecimalSearch() {
        for (int i = 0; i < Exp.length(); i++) {
            if (Exp.charAt(i) == '.')
                return true;
        }
        return false;
    }

    protected void AddResults() {
        double n1 = new Double(num1);
        double n2 = new Double(num2);
        n1 = n1 + n2;
        AnsView.setText("Ans : " + n1);
        Ans = "0" + n1;
        Ans = Ans.substring(1, Ans.length());
        oprtors = '9';
    }

    protected void MinusResults() {
        double n1 = new Double(num1);
        double n2 = new Double(num2);
        n1 = n1 - n2;
        AnsView.setText("Ans : " + n1);
        Ans = "0" + n1;
        Ans = Ans.substring(1, Ans.length());
        oprtors = '9';
    }

    protected void Multiply() {
        double n1 = new Double(num1);
        double n2 = new Double(num2);
        n1 = n1 * n2;
        String  str="0"+n1;
        str=str.substring(1,str.length());
        AnsView.setText(str);
        Ans = str;
        oprtors = '9';
    }

    protected void Division() {
        double n1 = new Double(num1);
        double n2 = new Double(num2);
        n1 = n1 / n2;
        AnsView.setText("Ans : " + n1);
        Ans = "0" + n1;
        Ans = Ans.substring(1, Ans.length());
        oprtors = '9';
    }
}
