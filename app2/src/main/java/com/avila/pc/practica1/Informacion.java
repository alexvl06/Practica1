package com.avila.pc.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Informacion extends AppCompatActivity {

    TextView tInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        tInfo = (TextView)findViewById(R.id.tInfo);
        Bundle bN = this.getIntent().getExtras();
        Bundle bA = this.getIntent().getExtras();
        Bundle be = this.getIntent().getExtras();
        Bundle bP = this.getIntent().getExtras();
        Bundle bS = this.getIntent().getExtras();
        Bundle baf = this.getIntent().getExtras();
        Bundle bFecha = this.getIntent().getExtras();
        Bundle bCity = this.getIntent().getExtras();
        Bundle bC = this.getIntent().getExtras();

        tInfo.setText("Nombre Completo:  "+ bN.getString("NOMBRE")+" "+ bA.getString("APELLIDO")+ "\neMail: "+be.getString("EMAIL")+
                "\nTéléfono: "+bP.getString("PHONE")+"\nSexo: "+bS.getString("SEX")+"\nFecha de Nacimiento: "+bFecha.getString("FECHA")+"\nLugar de Nacimiento: "+bCity.getString("CITY")+"\nAficiones: "+baf.getString("AFICIONES")+"\nContraseña: "+bC.getString("CONTRASEÑA"));


    }

}