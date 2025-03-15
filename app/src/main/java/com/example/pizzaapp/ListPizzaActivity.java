package com.example.pizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzaapp.beans.Produit;
import com.example.pizzaapp.service.ProduitService;

public class ListPizzaActivity extends AppCompatActivity {
    ProduitService ps ;
    private ImageView image;
    private TextView desc;
    private TextView desctxt;
    private TextView preptxt;
    private TextView nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_list_pizza);
        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));
        ps = ProduitService.getInstance(); // cant use new here
        Produit p= ps.findById(id);
        image = findViewById(R.id.photo);
        image.setImageResource(p.getPhoto());
        nom = findViewById(R.id.nomPizza);
        nom.setText(p.getNom());
        desc = findViewById(R.id.descrption);
        desc.setText(p.getDescription());
        desctxt = findViewById(R.id.descriptiontxt);
        desctxt.setText(p.getDetailSingred()+"\n");
        preptxt =findViewById(R.id.preperationstps);
        preptxt.setText(p.getPreparation());






    }
}