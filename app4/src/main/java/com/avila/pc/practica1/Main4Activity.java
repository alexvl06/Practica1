package com.avila.pc.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class Main4Activity extends AppCompatActivity {

    private String[] colors1 = {"Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Púrpura", "Gris", "Blanco"};
    private String[] colors2 = {"Negro", "Marrón", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Dorado", "Plateado"};
    private String[] colors3 = {"marrón", "rojo", "dorado", "plateado"};
    private float n1 = 0, n2 = 0, n3, res;
    String n4;
    private TextView mostrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Spinner Band1, Band2, Band3, Band4;
        Button Calc;

        Band1 = (Spinner) findViewById(R.id.spb1);
        Band2 = (Spinner) findViewById(R.id.spb2);
        Band3 = (Spinner) findViewById(R.id.spb3);
        Band4 = (Spinner) findViewById(R.id.spb4);
        mostrar =(TextView)findViewById(R.id.tv);
        Calc = (Button)findViewById(R.id.calc);

        ArrayAdapter<String> coloradaptor1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colors1);
        ArrayAdapter<String> coloradaptor2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colors2);
        ArrayAdapter<String> coloradaptor3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, colors3);
        Band1.setAdapter(coloradaptor1);
        Band2.setAdapter(coloradaptor1);
        Band3.setAdapter(coloradaptor2);
        Band4.setAdapter(coloradaptor3);


        Band1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        break;

                    case 1:
                        n1 = 10;
                        break;

                    case 2:
                        n1 = 20;
                        break;

                    case 3:
                        n1 = 30;
                        break;

                    case 4:
                        n1 = 40;
                        break;

                    case 5:
                        n1 = 50;
                        break;

                    case 6:
                        n1 = 60;
                        break;

                    case 7:
                        n1 = 701;
                        break;

                    case 8:
                        n1 = 80;
                        break;

                    case 9:
                        n1 = 90;
                        break;
                }
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Band2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        break;

                    case 1:
                        n2 = 1;
                        break;

                    case 2:
                        n2 = 2;
                        break;

                    case 3:
                        n2 = 3;
                        break;

                    case 4:
                        n2 = 4;
                        break;

                    case 5:
                        n2 = 5;
                        break;

                    case 6:
                        n2 = 6;
                        break;

                    case 7:
                        n2 = 7;
                        break;

                    case 8:
                        n2 = 8;
                        break;

                    case 9:
                        n2 = 9;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Band3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        n3 = 1;
                        break;

                    case 1:
                        n3 = 10;
                        break;

                    case 2:
                        n3 = 100;
                        break;

                    case 3:
                        n3 = 1000;
                        break;

                    case 4:
                        n3 = 10000;
                        break;

                    case 5:
                        n3 = 100000;
                        break;

                    case 6:
                        n3 = 1000000;
                        break;

                    case 7:
                        n3 = (float) 0.1;
                        break;

                    case 8:
                        n3 = (float) 0.01;
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Band4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        n4 = "1%";
                        break;

                    case 1:
                        n4 = "2%";
                        break;

                    case 2:
                        n4 = "5%";
                        break;

                    case 3:
                        n4 = "10%";
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                res = (n1+n2)*n3;
                mostrar.setText(""+res+" ohmios con una tolerancia de mas o menos "+n4);

            }
        });
    }
}
