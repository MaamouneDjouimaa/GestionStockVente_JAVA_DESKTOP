/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection con;

    public DAO(Connection con) {
        this.con = con;
    }

    public void ajouterProduit(Produit produit) {
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO stock (nom, quantite, prix) VALUES (?, ?, ?)");
            st.setString(1, produit.getNom());
            st.setInt(2, produit.getQuantite());
            st.setDouble(3, produit.getPrix());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void supprimerProduit(String nom) {
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM stock WHERE nom = ?");
            st.setString(1, nom);
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consulterStock() {
        try {
            PreparedStatement st = con.prepareStatement("SELECT * FROM stock");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                System.out.println("Produit: " + rs.getString("nom") + ", quantité: " + rs.getInt("quantite") + ", prix: " + rs.getDouble("prix"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void consulterTotal(){
        try {
            PreparedStatement st = con.prepareStatement("SELECT SUM(prix*quantite) as total FROM stock");
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                System.out.println("Total stock : " + rs.getDouble("total"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
