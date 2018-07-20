package com.exampleandroiddemottest.petagramrecyclerview;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PetsAdapter  extends  RecyclerView.Adapter<PetsAdapter.PetsViewHolder>{


    ArrayList<Pets> petsArrayLi;
    Activity activity;

    public PetsAdapter(ArrayList<Pets> petsArrayLi, Activity activity) {
        this.petsArrayLi = petsArrayLi;
        this.activity = activity;
    }






    //Inflar el layout y lo pasara al viewholder para el obtenga los views
    @NonNull
    @Override
    public PetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflar o dar vida a nuestro layour cardview;
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_card__view__peg,parent,false);

        PetsViewHolder petsViewHolder = new PetsViewHolder(v);

        return petsViewHolder;
    }

    ////Asocia cada elemnto de  la lista con cada view
    ////
    //Este metodo se va invocando cada vez que se va recorriendo la lista de contactos, uno a uno items.
    //y va obteniendo la position of each element
    //asi va extrayendo los elementos de cada lista

    @Override
    public void onBindViewHolder(@NonNull PetsViewHolder petsViewHolder, int position) {

            final  Pets pets  = petsArrayLi.get(position);

//            petsViewHolder.imgPhotoMain.setImageResource(pets.getImageMain());
//             petsViewHolder.textBoneWhite.setText(pets.getNamePets());
//              petsViewHolder.textBoneYellow.setText(pets.getCountRating());


        petsViewHolder.imgPhotoMain.setImageResource(pets.getImageMain());
        petsViewHolder.textBoneWhite.setText("");
        petsViewHolder.textBoneYellow.setText("");



       /* contactoViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,contacto.getNombre(),Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity,DetalleContacto.class);
                intent.putExtra(activity.getResources().getString(R.string.pNombre),contacto.getNombre());
                intent.putExtra(activity.getResources().getString(R.string.pTelefono),contacto.getTelefono());
                intent.putExtra(activity.getResources().getString(R.string.pEmail),contacto.getEmail());
                activity.startActivity(intent);
            }
        });

        contactoViewHolder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity,"Diste like a "+ contacto.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return petsArrayLi.size();
    }

    public static  class PetsViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgPhotoMain;
        private  ImageView imgBoneWhite;
        private TextView textBoneWhite;
        private TextView  textBoneYellow;
        private  ImageView imgBoneYellow;


        public PetsViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgPhotoMain = itemView.findViewById(R.id.imgPhotoMain);
            this.imgBoneWhite = itemView.findViewById(R.id.imgBoneWhite);
            this.textBoneWhite = itemView.findViewById(R.id.textBoneWhite);
            this.textBoneYellow = itemView.findViewById(R.id.textBoneYellow);
            this.imgBoneYellow = itemView.findViewById(R.id.imgBoneYellow);
        }


    }

}
