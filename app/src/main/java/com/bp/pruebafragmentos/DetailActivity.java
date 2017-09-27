package com.bp.pruebafragmentos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/* Esta actividad gestiona la vista detalles.
* */

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity_layout);

        /*Carga el nuevo layout y muestra la cadena de caracteres que se pasa como parámetro*/
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String s = extras.getString("value");
            TextView view = (TextView) findViewById(R.id.detailsText);
            view.setText(s);
        }
    }
}
