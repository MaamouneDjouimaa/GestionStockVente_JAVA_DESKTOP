/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;


import java.sql.Connection;
import java.util.ArrayList;

public class GestionStockVente {
    public static void main(String[] args) {
        
        //Connection a la BD
        //DBConnection connection = new DBConnection();
        //Connection con = connection.connect();
        
        // Création du stock
        Stock stock = new Stock();

        // Création de produits
        Produit produit1 = new Produit("Ordinateur portable", 10, 150000);
        Produit produit2 = new Produit("Smartphone", 50, 90000);
        Produit produit3 = new Produit("Tablette", 30, 85000);

        // Ajout des produits au stock
        stock.ajouterProduit(produit1);
        stock.ajouterProduit(produit2);
        stock.ajouterProduit(produit3);

        // Création d'un vendeur
        Vendeur vendeur = new Vendeur(stock);

        // Création d'un client
        Client client = new Client("Kamel", "123 kalitous Alger", "0776655443");

        // Création d'une commande
        ArrayList<Produit> produitsCommande = new ArrayList<>();
        produitsCommande.add(produit1);
        produitsCommande.add(produit2);
        
        Paiement informationsPaiement = new Paiement("carte de crédit", 1499.98, "01/01/2022");
        Commande commande = new Commande(produitsCommande, informationsPaiement);

        // Etablissement de la commande
        vendeur.etablirCommande((ArrayList<Produit>) commande.getProduits(), commande.getInformationsPaiement());

        // Affichage de la commande
        System.out.println("Commande: " + commande);
        System.out.println("Stock: " + stock.consulterStock());
        System.out.println("Client: " + client);
        
        //DAO dao = new DAO();

        stock.consulterTotal();
    }
}
