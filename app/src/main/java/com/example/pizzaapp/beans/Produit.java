package com.example.pizzaapp.beans;

public class Produit {
    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detailSingred;
    private String description;
    private String preparation;
   // private int comp;
    private static int count;
    public Produit(){}

 /*   public Produit(String nom, int nbrIngredients, int photo, float duree, String detailSingred, String description, String preparation) {
        this.id = ++count;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detailSingred = detailSingred;
        this.description = description;
        this.preparation = preparation;

    }*/

    public Produit(String name, int i, int image, String s, String ingredients, String description, String prep) {

        this.id = ++count;
        this.nom = name;
        this.nbrIngredients = i;
        this.photo = image;
      //  this.duree =  Float.parseFloat(s.replaceAll("[^0-9]", ""));
        this.duree = s;
        this.detailSingred = ingredients;
        this.description = description;
        this.preparation = prep;

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDuree() {
        return duree;
    }

    public String getDetailSingred() {
        return detailSingred;
    }

    public String getDescription() {
        return description;
    }

    public String getPreparation() {
        return preparation;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setDetailSingred(String detailSingred) {
        this.detailSingred = detailSingred;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }


}
