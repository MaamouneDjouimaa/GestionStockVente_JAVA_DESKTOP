/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

public class Client {
    // Attributs
    private String nom;
    private String adresse;
    private String numeroTelephone;

    // Constructeur
    public Client(String nom, String adresse, String numeroTelephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
    }

    // Méthodes
    public String toString() {
        return "Nom: " + nom + ", Adresse: " + adresse + ", Numéro de téléphone: " + numeroTelephone;
    }
}
