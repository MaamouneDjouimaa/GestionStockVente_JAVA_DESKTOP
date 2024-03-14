/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

public class Paiement {
// Attributs
private String type;
private double montant;
private String date;

// Constructeur
public Paiement(String type, double montant, String date) {
    this.type = type;
    this.montant = montant;
    this.date = date;
}

// Méthodes
public String toString() {
    return "Type: " + type + ", Montant: " + montant + ", Date: " + date;
}

// Getters
public String getType() {
    return type;
}

public double getMontant() {
    return montant;
}

public String getDate() {
    return date;
}

// Setters
public void setType(String type) {
    this.type = type;
}

public void setMontant(double montant) {
    this.montant = montant;
}

public void setDate(String date) {
    this.date = date;
}
}

