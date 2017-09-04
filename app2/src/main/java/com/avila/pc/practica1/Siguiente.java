package com.avila.pc.practica1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Calendar;



public class Siguiente extends AppCompatActivity {

    private CheckBox cbLectura, cbMusica, cbFutbol, cbOtros;
    private EditText etOtros, etOtra;
    private RadioButton man, woman;
    private String aux = "Ninguna", sexo, strCity = null;
    private int año, mes , dia;
    private EditText efecha;
    String[] CityData = {" ","Almaguer","Amagá", "Arauca", "Armenia","Apartadó", "Barrancabermeja","Barranquilla","Bello","Bogotá","Bucaramanga","Buenaventura", "Cali","Caldas","Cartagena","Cesar","Cucuta", "Chambú", "Chia", "Ciénaga", "Ciénaga de Oro", "Cordoba", "Cumbal","Envigado","Espinal","Florencia", "Fonseca","Gamarra", "Girardot","Guachucal","Guarne", "Guatabita","Honda", "Ibagué","Ipiales", "Itagüi","Juanchito","La Cruz","La Dorada","La Estrella", "Laureles","Leticia","Manizales", "Manrique","Marinilla", "Medellin", "Mercedes","Miranda","Mitú","Montéria","Mocoa","Monpos","Necoclí", "Neiva","Ninibe", "Ocaña","Palmira", "Pamplona","Papares","Pasto", "Pereira", "Piedecuesta", "Piendamo","Pitalito","Plato", "Popayán","Pueblo Nuevo","Puebo Viejo","Puerto Asis","Puerto Carreño","Puerto Colombia","Puerto Inirida", "Pupiales","Quibdo","Rimiquira","Rioblanco","Riofrio", "Riohacha","Rionegro","Sabanalarga","SabanaGrande","Sabaneta","Salsipuedes","Samaniego","San Andrés","San Antonio","San Benito","San José del Guabiare","San Juan del Cesar","San Vicente del Chucuri", "San Pablo","Santa Marta","Sevilla" ,"Silvia","Sincé" ,"Sincelejo", "Soacha", "Soledad","Sonsón", "Tasajera","Tazará","Tierra Adentro","Tolima","Totoro", "Tuluá","Tunia", "Tunja", "Tuquerres", "Uraba","Uribia","Usme", "Ubaté","Valledupar", "Velez", "Villavicencio","Viotá","Yolombo","Yopal","Zapatoca", "Zarzal","Zipaquira", "Zona Bananera", "Otra"};
    private static final int TIPO_DIALOGO = 0;
    private static DatePickerDialog.OnDateSetListener selector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siguiente);

        man = (RadioButton) findViewById(R.id.masculino);
        woman = (RadioButton) findViewById(R.id.femenino);

        cbLectura = (CheckBox) findViewById(R.id.cbLectura);
        cbMusica = (CheckBox) findViewById(R.id.cbMusica);
        cbFutbol = (CheckBox) findViewById(R.id.cbFutbol);
        cbOtros = (CheckBox) findViewById(R.id.cbOtros);
        etOtros = (EditText) findViewById(R.id.etOtro);

        efecha = (EditText) findViewById(R.id.eFecha);
        efecha.setText("");
        Calendar calendario = Calendar.getInstance();
        año = calendario.get(Calendar.YEAR);
        mes = calendario.get(Calendar.MONTH) + 1;
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        Spinner City;
        City = (Spinner) findViewById(R.id.sCity);
        etOtra = (EditText) findViewById(R.id.etOtra);


        ArrayAdapter<String> cityadaptor = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, CityData);
        City.setAdapter(cityadaptor);

        City.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        break;

                    case 1:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Almaguer";
                        break;

                    case 2:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Amagá";
                        break;

                    case 3:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Arauca";
                        break;

                    case 4:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Armenia";
                        break;

                    case 5:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Apartadó";
                        break;

                    case 6:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Barrancabermeja";
                        break;

                    case 7:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Barranquilla";
                        break;

                    case 8:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Bello";
                        break;

                    case 9:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Bogotá";
                        break;

                    case 10:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Bucaramanga";
                        break;

                    case 11:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Buenaventura";
                        break;

                    case 12:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Cali";
                        break;

                    case 13:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Caldas";
                        break;

                    case 14:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Cartagena";
                        break;

                    case 15:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Cesar";
                        break;

                    case 16:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Cucuta";
                        break;

                    case 17:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Chambú";
                        break;

                    case 18:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Chia";
                        break;

                    case 19:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Ciénaga";
                        break;

                    case 20:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Ciénaga de Oro";
                        break;

                    case 21:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Cordoba";
                        break;

                    case 22:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Cumbal";
                        break;

                    case 23:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Envigado";
                        break;

                    case 24:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Espinal";
                        break;

                    case 25:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Florencia";
                        break;

                    case 26:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Fonseca";
                        break;

                    case 27:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Gamarra";
                        break;

                    case 28:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Girardot";
                        break;

                    case 29:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Guachucal";
                        break;

                    case 30:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Guarne";
                        break;

                    case 31:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Guatabita";
                        break;

                    case 32:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Honda";
                        break;

                    case 33:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Ibagué";
                        break;

                    case 34:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Ipiales";
                        break;

                    case 35:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Itagüi";
                        break;

                    case 36:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Juanchito";
                        break;

                    case 37:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "La Cruz";
                        break;

                    case 38:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "La Dorada";
                        break;

                    case 39:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "La Estrella";
                        break;

                    case 40:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Laureles";
                        break;

                    case 41:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Leticia";
                        break;

                    case 42:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Manizales";
                        break;

                    case 43:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Manrique";
                        break;

                    case 44:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Marinilla";
                        break;

                    case 45:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Medellin";
                        break;

                    case 46:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Mercedes";
                        break;

                    case 47:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Miranda";
                        break;

                    case 48:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Mitú";
                        break;

                    case 49:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Montéria";
                        break;

                    case 50:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Mocoa";
                        break;

                    case 51:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Monpos";
                        break;

                    case 52:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Necoclí";
                        break;

                    case 53:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Neiva";
                        break;

                    case 54:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Ninibe";
                        break;

                    case 55:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Ocaña";
                        break;

                    case 56:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Palmira";
                        break;

                    case 57:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Pamplona";
                        break;

                    case 58:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Papares";
                        break;

                    case 59:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Pasto";
                        break;

                    case 60:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Pereira";
                        break;

                    case 61:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Piedecuesta";
                        break;

                    case 62:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Piendamo";
                        break;

                    case 63:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Pitalito";
                        break;

                    case 64:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Plato";
                        break;

                    case 65:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Popayán";
                        break;

                    case 66:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Pueblo Nuevo";
                        break;

                    case 67:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Puebo Viejo";
                        break;

                    case 68:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Puerto Asis";
                        break;

                    case 69:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Puerto Carreño";
                        break;

                    case 70:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Puerto Colombia";
                        break;

                    case 71:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Puerto Inirida";
                        break;

                    case 72:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Pupiales";
                        break;

                    case 73:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Quibdo";
                        break;

                    case 74:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Rimiquira";
                        break;

                    case 75:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Rioblanco";
                        break;

                    case 76:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Riofrio";
                        break;

                    case 77:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Riohacha";
                        break;

                    case 78:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Rionegro";
                        break;

                    case 79:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Sabanalarga";
                        break;

                    case 80:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "SabanaGrande";
                        break;

                    case 81:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Sabaneta";
                        break;

                    case 82:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Salsipuedes";
                        break;

                    case 83:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Samaniego";
                        break;

                    case 84:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "San Andrés";
                        break;

                    case 85:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "San Antonio";
                        break;

                    case 86:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "San Benito";
                        break;

                    case 87:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "San José del Guabiare";
                        break;

                    case 88:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "San Juan del Cesar";
                        break;

                    case 89:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "San Vicente del Chucuri";
                        break;

                    case 90:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "San Pablo";
                        break;

                    case 91:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Santa Marta";
                        break;

                    case 92:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Sevilla";
                        break;

                    case 93:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Silvia";
                        break;

                    case 94:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Sincé";
                        break;

                    case 95:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Sincelejo";
                        break;

                    case 96:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Soacha";
                        break;

                    case 97:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Soledad";
                        break;

                    case 98:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Sonsón";
                        break;

                    case 99:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tasajera";
                        break;

                    case 100:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tazará";
                        break;

                    case 101:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tierra Adentro";
                        break;

                    case 102:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tolima";
                        break;

                    case 103:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Totoro";
                        break;

                    case 104:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tuluá";
                        break;

                    case 105:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tunia";
                        break;

                    case 106:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tunja";
                        break;

                    case 107:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Tuquerres";
                        break;

                    case 108:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Uraba";
                        break;

                    case 109:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Uribia";
                        break;

                    case 110:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Usme";
                        break;

                    case 111:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Ubate";
                        break;

                    case 112:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Valledupar";
                        break;

                    case 113:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Velez";
                        break;

                    case 114:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Villavicencio";
                        break;

                    case 115:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Viotá";
                        break;

                    case 116:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Yolombo";
                        break;

                    case 117:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Yopal";
                        break;

                    case 118:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Zapatoca";
                        break;

                    case 119:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Zarzal";
                        break;

                    case 120:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Zipaquira";
                        break;

                    case 121:
                        etOtra.setVisibility(View.INVISIBLE);
                        strCity = "Zona Bananera";
                        break;

                    case 122:
                        etOtra.setVisibility(View.VISIBLE);
                        strCity = " ";
                        break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        selector = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                año = year;
                mes = month + 1;
                dia = dayOfMonth;
                mostrarFecha();

            }
        };




            Button bRegistrar;
            bRegistrar = (Button)findViewById(R.id.bRegistrar);

            bRegistrar.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                @Override
                public void onClick(View v) {
                    if (efecha.getText().toString().equals("") || strCity == null) {
                        Toast.makeText(getBaseContext(), "Complete los datos", Toast.LENGTH_LONG).show();
                    } else {

                        Bundle bN = getIntent().getExtras();
                        Bundle bA = getIntent().getExtras();
                        Bundle be = getIntent().getExtras();
                        Bundle bP = getIntent().getExtras();
                        Bundle bC = getIntent().getExtras();


                        // creamos el intent
                        Intent intent = new Intent(Siguiente.this, Informacion.class);
                        //
                        if (etOtra.getVisibility() == View.VISIBLE) {
                            strCity = etOtra.getText().toString();
                        }


                        if (man.isChecked()) {
                            sexo = "Masculino";
                        } else {

                            if (woman.isChecked()) {
                                sexo = "Femenino";
                            } else
                                sexo = "sin definir";
                        }

                        if(cbLectura.isChecked()||cbMusica.isChecked()||cbFutbol.isChecked()||cbOtros.isChecked()) {
                            aux = " ";
                            if (cbLectura.isChecked()) {
                                aux += " Lectura, ";
                                cbLectura.setChecked(false);
                            }
                            if (cbMusica.isChecked()) {
                                aux += " Música, ";
                                cbMusica.setChecked(false);
                            }
                            if (cbFutbol.isChecked()) {
                                aux += " Futbol, ";
                                cbFutbol.setChecked(false);
                            }
                            if (cbOtros.isChecked()) {
                                aux += etOtros.getText().toString();
                                cbOtros.setChecked(false);
                                etOtros.setText(" ");
                                etOtros.setVisibility(View.INVISIBLE);
                            }
                        }

                        // creamos la información a pasar entre actividades


                        Bundle bS = new Bundle();
                        Bundle baf = new Bundle();
                        Bundle bFecha = new Bundle();
                        Bundle bCity = new Bundle();


                        bS.putString("SEX", sexo);
                        baf.putString("AFICIONES", aux);
                        bFecha.putString("FECHA", efecha.getText().toString());
                        bCity.putString("CITY", String.valueOf(strCity));

                        // Añadir la información al intent
                        intent.putExtras(bN);
                        intent.putExtras(bA);
                        intent.putExtras(be);
                        intent.putExtras(bP);
                        intent.putExtras(bC);
                        intent.putExtras(bS);
                        intent.putExtras(baf);
                        intent.putExtras(bFecha);
                        intent.putExtras(bCity);

                        // iniciamos la nueva actividad
                        startActivity(intent);
                        aux = "Ninguna";
                    }
                }
            });



    }

    public void Otro(View view) {
        if(cbOtros.isChecked())
            etOtros.setVisibility(View.VISIBLE);

        else
            etOtros.setVisibility(View.INVISIBLE);

    }



    public void mostrarFecha(){

        efecha.setText(dia+"/"+mes+"/"+año);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch(id){

            case 0:
                return new DatePickerDialog(this,selector,año, mes , dia);

        }
        return null;

    }

    public void mostrarCalendario(View control) {

        showDialog(TIPO_DIALOGO);

    }
}


