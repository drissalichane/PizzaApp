package com.example.pizzaapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzaapp.R;
import com.example.pizzaapp.beans.Produit;
import com.example.pizzaapp.service.ProduitService;

import java.util.ArrayList;
import java.util.List;

public class PizzaAdapter extends BaseAdapter {

    private List<Produit> produits;
    private LayoutInflater inflater;
    public PizzaAdapter(Activity activity, List<Produit> produits) {
        this.produits = produits;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Object getItem(int position) {
        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position + 1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(R.layout.activity_details_pizzas, null);}
        TextView pizzaName = convertView.findViewById(R.id.nomPizza);
        TextView ingredients = convertView.findViewById(R.id.nbIngredient);
        TextView time= convertView.findViewById(R.id.temps);
        ImageView image= convertView.findViewById(R.id.photo);
        TextView idp= convertView.findViewById(R.id.idf);

      //  ProduitService ps = new ProduitService();

        idp.setText(produits.get(position).getId()+"");
        //   pizzaName.setText(ps.findById(position).getNom()+"");
        pizzaName.setText(produits.get(position).getNom());

        ingredients.setText(produits.get(position).getNbrIngredients()+"");
        time.setText(produits.get(position).getDuree()+"");
        image.setImageResource(produits.get(position).getPhoto());


return convertView;
    }
}
