package com.bp.pruebafragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*Actividad principal*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /*Abre la vista main y depediendo de la orientación del dispositivo se abre main o main(port)*/
    }
}
