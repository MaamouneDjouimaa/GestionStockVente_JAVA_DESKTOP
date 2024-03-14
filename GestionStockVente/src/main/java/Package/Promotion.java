/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;

public class Promotion {
    // Attributs
    private String nom;
    private ArrayList<Produit> produitsConcernes;
    private double tauxReduction;

    // Constructeur
    public Promotion(String nom, ArrayList<Produit> produitsConcernes, double tauxReduction) {
        this.nom = nom;
        this.produitsConcernes = produitsConcernes;
    	  this.tauxReduction = tauxReduction;
}

// Méthodes
public String toString() {
    return "Nom: " + nom + ", Produits concernés: " + produitsConcernes + ", Taux de réduction: " + tauxReduction;
}

public void appliquerPromotion(Commande commande) {
    // Appliquer la promotion à la commande
}

}
