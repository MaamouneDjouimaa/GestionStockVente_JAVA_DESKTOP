/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;

public class Stock {
    // Attributs
    private ArrayList<Produit> produits;

    // Constructeur
    public Stock() {
        produits = new ArrayList<Produit>();
    }

    // Méthodes
    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
    }

    public ArrayList<Produit> consulterStock() {
        return produits;
    }
    
    
    public void consulterTotal() {
    double total = 0;
    for (Produit produit : produits) {
        total += produit.calculerPrixTotal();
    }
    System.out.println("Total de la valeur des produits dans le stock : " + total);
}

       
    
    
}

