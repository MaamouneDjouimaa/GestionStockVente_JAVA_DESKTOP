/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

public class Produit {
// Attributs
private String nom;
private int quantite;
private double prix;

// Constructeur
public Produit(String nom, int quantite, double prix) {
    this.nom = nom;
    this.quantite = quantite;
    this.prix = prix;
}

// Méthodes
public String toString() {
    return "Nom: " + nom + ", Quantité: " + quantite + ", Prix: " + prix;
}

public double calculerPrixTotal() {
    return quantite * prix;
}

// Getters and Setters
public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public int getQuantite() {
    return quantite;
}

public void setQuantite(int quantite) {
    this.quantite = quantite;
}

public double getPrix() {
    return prix;
}

public void setPrix(double prix) {
    this.prix = prix;
}
}