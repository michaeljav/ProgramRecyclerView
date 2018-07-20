package com.exampleandroiddemottest.petagramrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pets> pets;
    private RecyclerView listaPets;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPets = findViewById(R.id.rvPets);

        //Forma en mostrar  el en el recycler;
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaPets.setLayoutManager(llm);

       inicializarListadePets();
       inicializarAdactador();

    }


    public void inicializarAdactador(){
        PetsAdapter adaptador = new PetsAdapter(pets,this);
        listaPets.setAdapter(adaptador);
    }

    public void inicializarListadePets(){


        pets = new ArrayList<Pets>();

      pets.add(new Pets(R.drawable.uno,"Perro1",1));
//        pets.add(new Pets(R.drawable.dos,"Perro2",2));
//        pets.add(new Pets(R.drawable.tres,"Perro3",3));

    }
}
