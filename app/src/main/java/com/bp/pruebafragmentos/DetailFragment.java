package com.bp.pruebafragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by borja on 27/9/17.
 * Este fragmento representa los detalles.
 */

public class DetailFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    /*Se invoca en la creación de un fragmento*/
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.details,container,false);
        return view;
    }

    public void setText(String item){
        TextView view = (TextView) getView().findViewById(R.id.detailsText);
        view.setText(item);
    }
}
