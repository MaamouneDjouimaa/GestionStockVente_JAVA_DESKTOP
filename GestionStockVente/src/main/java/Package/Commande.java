/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    // Attributs
    private ArrayList<Produit> produits;
    private Paiement informationsPaiement;

    // Constructeur
    public Commande(ArrayList<Produit> produits, Paiement informationsPaiement) {
        this.produits = produits;
        this.informationsPaiement = informationsPaiement;
    }

    // Méthodes
    public String toString() {
        return "Produits: " + produits + ", Informations de paiement: " + informationsPaiement;
    }

    public double calculerTotal() {
        double total = 0;
        for (Produit produit : produits) {
            total += produit.calculerPrixTotal();
        }
        return total;
    }
    
    public List<Produit> getProduits() {
    return produits;
}
    
    public Paiement getInformationsPaiement() {
    return informationsPaiement;
}


}
