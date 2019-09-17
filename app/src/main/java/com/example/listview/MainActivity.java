package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Inmueble> lista = new ArrayList<Inmueble>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarListView();
    }

    public void generarListView (){

        ArrayAdapter<Inmueble> adapter = new ListAdapter(getApplicationContext(), R.layout.item, lista, getLayoutInflater());
        ListView lv = findViewById(R.id.myList);
        lv.setAdapter(adapter);
    }

    public void cargarDatos() {

        lista.add(new Inmueble(R.drawable.casa1, 100000, "La Punta, San Luis"));
        lista.add(new Inmueble(R.drawable.casa2, 108000, "La Toma, San Luis"));
        lista.add(new Inmueble(R.drawable.casa3, 190000, "San Luis, San Luis"));
    }

}
