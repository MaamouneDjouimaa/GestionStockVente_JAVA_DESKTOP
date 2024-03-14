package Package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NewClass {
    public static void main(String[] args) {
        
        // Connection à la BD
        DBConnection connection = new DBConnection();
        Connection con = connection.connect();
        
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

        // Ajout des produits dans la BD
        try {
            // Préparation de la requête d'insertion
            String sql = "INSERT INTO produit (nom, quantite, prix) VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

            // Ajout des produits dans la BD
            statement.setString(1, produit1.getNom());
            statement.setInt(2, produit1.getQuantite());
            statement.setDouble(3, produit1.getPrix());
            statement.executeUpdate();

            statement.setString(1, produit2.getNom());
            statement.setInt(2, produit2.getQuantite());
            statement.setDouble(3, produit2.getPrix());
            statement.executeUpdate();

            statement.setString(1, produit3.getNom());
            statement.setInt(2, produit3.getQuantite());
            statement.setDouble(3, produit3.getPrix());
            statement.executeUpdate();

            System.out.println("Produits ajoutés à la BD.");

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout des produits à la BD : " + e);
        }

        // Création d'un vendeur
        Vendeur vendeur = new Vendeur(stock);

        // Création d'un client
        Client client = new Client("Kamel", "123 kalitous Alger", "0776655443");

        // Création d'une commande
        ArrayList<Produit> produitsCommande = new ArrayList<>();
        produitsCommande.add(produit1);
        produitsCommande.add(produit2);
        
        Paiement informationsPaiement = new Paiement("carte de crédit",1499.98, "01/01/2022");
        Commande commande = new Commande(produitsCommande, informationsPaiement);
        
    // Ajout des données de la commande dans la BD
    try {
        PreparedStatement ps = con.prepareStatement("INSERT INTO commande (type_paiement, montant, date) VALUES (?,?,?)");
        ps.setString(1, commande.getInformationsPaiement().getType());
        ps.setDouble(2, commande.getInformationsPaiement().getMontant());
        ps.setString(3, commande.getInformationsPaiement().getDate());
        ps.executeUpdate();
        System.out.println("Commande ajoutée à la BD avec succès.");
    } catch (SQLException e) {
        System.out.println(e);
    }
    
    // Etablissement de la commande
    vendeur.etablirCommande((ArrayList<Produit>) commande.getProduits(), commande.getInformationsPaiement());

    // Affichage des données depuis la BD
    try {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM commande");
        while (rs.next()) {
            System.out.println("Commande: ");
            System.out.println("Type de paiement: " + rs.getString("type_paiement"));
            System.out.println("Montant: " + rs.getDouble("montant"));
            System.out.println("Date de validité: " + rs.getString("date_validite"));
        }
    } catch (SQLException e) {
        System.out.println(e);
    }
    
    // Fermeture de la connexion à la BD
    try {
        con.close();
        System.out.println("Connexion fermée.");
    } catch (SQLException e) {
        System.out.println(e);
    }
}
}
        
