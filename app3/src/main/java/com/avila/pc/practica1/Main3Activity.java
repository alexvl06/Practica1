package com.avila.pc.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.avila.pc.practica1.R;

public class Main3Activity extends AppCompatActivity {

    TextView Display;
    Double n1 = 0.0, n2 = 0.0, Res = null;
    String Op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Display = (TextView)findViewById(R.id.tVdisplay);
    }

    public void cero (View view){

        if(Res != null){
            Display.setText("");
            Res = null;
        }


    }

    public void uno (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"1");
    }

    public void dos (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }

        Display.setText(Display.getText()+"2");
    }

    public void tres (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"3");
    }

    public void cuatro (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"4");
    }

    public void cinco (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"5");
    }

    public void seis (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"6");
    }

    public void siete (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"7");
    }

    public void ocho (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"8");
    }

    public void nueve (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+"9");
    }

    public void punto (View view){
        if(Res != null){
            Display.setText("");
            Res = null;
        }
        Display.setText(Display.getText()+".");
    }

    public void CapturaNumero (View view){

        n1 = Double.parseDouble(Display.getText().toString());
        Display.setText("");

    }

    public void suma (View view){

        Op = "+";
        CapturaNumero(view);
    }

    public void resta (View view){

        Op = "-";
        CapturaNumero(view);
    }

    public void multiplicacion (View view){

        Op = "*";
        CapturaNumero(view);
    }

    public void division (View view){

        Op = "/";
        CapturaNumero(view);
    }

    public void igual (View view){

        n2 = Double.parseDouble(Display.getText().toString());
        if(Op.equals("+")){
            Res = n1+n2;
        }else if(Op.equals("+")) {
            Res = n1 - n2;
        }else
        if(Op.equals("-")){
            Res = n1-n2;}
        else if(Op.equals("*")) {
            Res = n1 * n2;
        }else if(Op.equals("/")) {
            Res = n1 / n2;
        }

        Display.setText(""+Res);




    }
}


