package com.avila.pc.practica1;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    private EditText eRepet, ePass, eNombre, eApellido, email, ePhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        eNombre = (EditText) findViewById(R.id.eNombre);
        eNombre.setText("");
        eApellido = (EditText) findViewById(R.id.eApellido);
        eApellido.setText("");
        email = (EditText) findViewById(R.id.eMail);
        email.setText("");
        ePhone = (EditText) findViewById(R.id.ePhone);
        ePhone.setText("");
        ePass = (EditText) findViewById(R.id.ePass);
        ePass.setText("");
        eRepet = (EditText) findViewById(R.id.eRepet);
        eRepet.setText("");

        Button bSiguiente;
        bSiguiente = (Button) findViewById(R.id.bNext);

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {




                if(eRepet.getText().toString().equals("") || eNombre.getText().toString().equals("") || eApellido.getText().toString().equals("") || email.getText().toString().equals("") || ePhone.getText().toString().equals("")|| ePass.getText().toString().equals("")) {
                    Toast.makeText(getBaseContext(), "Faltan datos", Toast.LENGTH_LONG).show();
                }
                else{


                    if (ePass.getText().toString().equals(eRepet.getText().toString())) {
                        // creamos el intent
                        Intent intent1 = new Intent(Main2Activity.this, Siguiente.class);
                        // creamos la información a pasar entre actividades
                        Bundle bN = new Bundle();
                        Bundle bA = new Bundle();
                        Bundle be = new Bundle();
                        Bundle bP = new Bundle();
                        Bundle bC = new Bundle();


                        bN.putString("NOMBRE", eNombre.getText().toString());
                        bA.putString("APELLIDO", eApellido.getText().toString());
                        be.putString("EMAIL", email.getText().toString());
                        bP.putString("PHONE", ePhone.getText().toString());
                        bC.putString("CONTRASEÑA", ePass.getText().toString());

                        // Añadir la información al intent
                        intent1.putExtras(bN);
                        intent1.putExtras(bA);
                        intent1.putExtras(be);
                        intent1.putExtras(bP);
                        intent1.putExtras(bC);


                        // iniciamos la nueva actividad
                        startActivity(intent1);

                    } else {
                        Toast.makeText(getBaseContext(), "Contraseñas no Coinciden", Toast.LENGTH_LONG).show();
                        ePass.setText(null);
                        eRepet.setText(null);

                    }
                }

            }
        });
    }


}
