package service;

public class Article {
    private static int compteur = 0;
    private final int id;
    private final String nom;
    private final double prix;

    public Article(String nom, double prix) {
        this.id = ++compteur;
        this.nom = nom;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }
}
