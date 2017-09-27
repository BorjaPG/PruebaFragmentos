package com.bp.pruebafragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by borja on 26/9/17.
 * Este fragmento representa la lista de elementos.
 */

public class ListFragment extends android.app.ListFragment {
    private String [] values = {"Cupcake","Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Ice cream sandwich", "Jelly bean",
    "KitKat", "Lollipop", "Marshmallow", "Nougat", "Oreo"};

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    /*Se invoca en la creación de un fragmento*/
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Se inicializa el adapter mediante la tabla values
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
        //Se asocia la lista al adapter
        setListAdapter(adapter);
    }

    /*Se sobrecarga para gestionar el click sobre un elemento de la lista*/
    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        //Se obtiene el elemento que ha recibido el click usando el adapter
        String item = (String) getListAdapter().getItem(position);
        //Se recupera el fragmento que sirve para mostrar los detalles
        DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);

        /*Si no es nulo está en horizontal, y se actualizaria los detalles*/
        if(fragment != null && fragment.isInLayout()){
            fragment.setText(item); //Se define el texto que muestra el fragmento detalles
        }else { /*Si es nulo quiere decir que está en modo vertical, los click´s se mostrarán en una nueva actividad*/
            Intent intent = new Intent(getActivity(),DetailActivity.class);
            intent.putExtra("value",item);
            startActivity(intent);
        }
    }

}
