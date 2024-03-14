/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.util.ArrayList;

public class Vendeur {
    // Attributs
    private Stock stock;

    // Constructeur
    public Vendeur(Stock stock) {
        this.stock = stock;
    }

    // Méthodes
    public void ajouterProduit(Produit produit) {
        stock.ajouterProduit(produit);
    }

    public void etablirCommande(ArrayList<Produit> produits, Paiement informationsPaiement) {
        Commande commande = new Commande(produits, informationsPaiement);
        // Enregistrement de la commande
    }

    public void annulerCommande(Commande commande) {
        // Annulation de la commande
    }

    public void gererRetour(Commande commande, Paiement paiement) {
        // Gestion du retour de produits et crédit du compte du client
    }
}
