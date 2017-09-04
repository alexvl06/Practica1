package com.avila.pc.practica1;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class Main1Activity extends AppCompatActivity {

    EditText longitud;
    TextView perimetro, area, volumen;
    RadioButton cuadrado, triangulo, circulo, cubo;
    Button bc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);


        longitud = (EditText) findViewById(R.id.ETlado);
        perimetro = (TextView) findViewById(R.id.TVperimetro);
        area = (TextView) findViewById(R.id.TVarea);
        volumen = (TextView) findViewById(R.id.TVolumen);
        cuadrado = (RadioButton) findViewById(R.id.CBsqr);
        triangulo = (RadioButton) findViewById(R.id.CBtr);
        circulo = (RadioButton) findViewById(R.id.CBcircle);
        cubo = (RadioButton) findViewById(R.id.CBcube);
        bc = (Button) findViewById(R.id.Bcalc);

        bc.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {


                float p, A, V;


                if (cuadrado.isChecked()) {
                    float longnum = Float.valueOf(longitud.getText().toString());
                    p = 4 * longnum;
                    A = longnum * longnum;
                    perimetro.setText("Perimetro: "+ p);
                    area.setText("Area: " + A);
                    volumen.setText("Volumen: No tiene");
                } else {
                    if (triangulo.isChecked()) {
                        float longnum = Float.valueOf(longitud.getText().toString());
                        p = 3 * longnum;
                        A = longnum*longnum*((float) 1.732050808)/4;
                        perimetro.setText("Perimetro: "+ p);
                        area.setText("Area: " + A);
                        volumen.setText("Volumen: No tiene");
                    } else {
                        if (circulo.isChecked()) {
                            float longnum = Float.valueOf(longitud.getText().toString());
                            p = (float) (3.1416 * longnum);
                            A = (float) (3.1416 * longnum * longnum / 4);
                            perimetro.setText("Perimetro: "+ p);
                            area.setText("Area: " + A);
                            volumen.setText("Volumen: No tiene");
                        } else {
                            if (cubo.isChecked()) {
                                float longnum = Float.valueOf(longitud.getText().toString());
                                p = 12 * longnum;
                                A = longnum * longnum * 6;
                                V = longnum * longnum * longnum;
                                perimetro.setText("Perímetro: "+ p);
                                area.setText("Área: " + A);
                                volumen.setText("Volumen: " + V);
                            }
                        }
                    }
                }


            }
        });
    }



    public void sqrt(View view) {
            longitud.setHint("Ingrese la longitud de un lado");
            perimetro.setText("Perímetro: ");
            area.setText("Área: ");
            volumen.setText("Volumen: ");



    }


    public void Circle(View view) {


            longitud.setHint("Ingrese la longitud del Díametro");
            perimetro.setText("Perímetro: ");
            area.setText("Área: ");
            volumen.setText("Volumen: ");


    }



}


