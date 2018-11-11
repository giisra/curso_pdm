package com.example.israel.u5_actividad1_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private final static int IMAGE_WIDTH =400;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Actividad 8 Creacion de una calculadora de porcentajes
        //En esta actividad crearas una aplicacion que calcule la diferencia relativa en porcentaje entre dos numeros.
        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml

        //Actividades
        //a) Ejecuta la aplicacion y familiarizate con el layout definido en R.layout.activity_main
        //b) Crea la logica para calcular la diferencia relativa en porcentaje entre dos numeros
        //c) La formula para calcular la diferencia relativa en porcentaje esta en: https://www.calculatorsoup.com/calculators/algebra/percent-change-calculator.php
        //d) La aplicacion debe calcular la diferencia relativa en porcentaje de los valores contenidos en "editText" y "editText2"
        //e) Al hacer click en el boton "button", la aplicacion debera calcular dicha diferencia y poner el resultado en el campo "textViewResult"
        //f) La aplicacion debera manejar adecuadamente el cambio de rotacion para el resultado y los campos de texto
        //e) Anota tus respuestas y las capturas de pantalla en un documento en Word
        //f) Sube tu codigo al repositorio.
        //g) Sube el documento Word a la plataforma Moodle. Incluye la liga a tu repositorio

        //Definimos un par de variables que nos permitan operar los números
        final EditText et1, et2;
        final DecimalFormat df = new DecimalFormat("#.00");

        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        Button btnCalcular = (Button) findViewById(R.id.button);
        final TextView tvResultado = (TextView) findViewById(R.id.textViewResult);
        final TextView tvResultado2 = (TextView) findViewById(R.id.textViewResult2);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double aux1 = Double.valueOf(et1.getText().toString());
                double aux1_abs = Math.abs(aux1);
                double aux2 = Double.valueOf(et2.getText().toString());
                double aux2_abs = Math.abs(aux2);
                //double resultado = (aux2 - aux1)/aux1_abs *100;
                //double resta = aux1 - aux2;
               // double division =df.format(double (aux2 - aux1)/aux1_abs);
                //double multiplica = division + 100;
                //String resultado = df.format((aux2 - aux1) / aux1_abs);
                String resultado = df.format(((aux2 - aux1) / aux1_abs)*100);
                //String resultado = df.format(resta).toString();
                tvResultado.setText("La variación en procentaje es "+ resultado);

                if (aux2 > aux1) {
                    tvResultado2.setText("Incrementa");
                } else if (aux2 == aux1) {
                    tvResultado2.setText("Sin cambio");
                } else {
                    tvResultado2.setText("Decrementa");
                }
            }
        });



    }
}