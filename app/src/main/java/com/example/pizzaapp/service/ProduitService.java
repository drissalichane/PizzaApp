package com.example.pizzaapp.service;

import com.example.pizzaapp.beans.Produit;
import com.example.pizzaapp.dao.IDAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDAO<Produit> {
    private List<Produit> produits;
    private static ProduitService instance;

    private ProduitService() {
        this.produits = new ArrayList<>();
    }

    public static ProduitService getInstance() {
        if(instance == null)
            instance =  new ProduitService();
        return instance;
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return produits.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : produits){
            if(p.getId()==id){
                return p;
            }

        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return produits;
    }
}
