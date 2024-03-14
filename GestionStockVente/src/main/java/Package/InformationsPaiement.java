/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Package;

public class InformationsPaiement {
    private String typePaiement;
    private String numeroCarte;
    private String nomTitulaire;
    private String dateExpiration;
    private String codeSecurite;

    public InformationsPaiement(String typePaiement, String numeroCarte, String nomTitulaire, String dateExpiration, String codeSecurite) {
        this.typePaiement = typePaiement;
        this.numeroCarte = numeroCarte;
        this.nomTitulaire = nomTitulaire;
        this.dateExpiration = dateExpiration;
        this.codeSecurite = codeSecurite;
    }

    public String getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(String typePaiement) {
        this.typePaiement = typePaiement;
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(String numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void setNomTitulaire(String nomTitulaire) {
        this.nomTitulaire = nomTitulaire;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(String dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getCodeSecurite() {
        return codeSecurite;
    }

    public void setCodeSecurite(String codeSecurite) {
        this.codeSecurite = codeSecurite;
    }
}
