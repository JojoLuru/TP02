/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.text.Collator;
import java.util.Locale;
/**
 *
 * @author jonathanraillard
 */
public class Participant {
    private int noPart;
    private String nom;
    private String prenom;
    private String tel;
    private ArrayList noActivite;
    
    public Participant (int noPart, String nom, String prenom, String tel){
        this.noPart = noPart;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
    }

    public int getNoPart() {
        return noPart;
    }
    
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTel() {
        return tel;
    }
    
    
    public void setNoPart(int noPart) {
        this.noPart = noPart;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setNoActivite(ArrayList noActivite) {
        this.noActivite = noActivite;
    }

    public String toString() {
        return nom + " " +  prenom ;
    }
    
    public int compareTo (Participant Part){
        Collator compareOperator = Collator.getInstance(Locale.FRENCH);
        compareOperator.setStrength(Collator.PRIMARY);
        if(Part.getNom().compareTo(this.nom)>0){
               return -1;
        } else if(Part.getNom().compareTo(this.nom)<0){
               return 1;             
        } else if(Part.getNom().compareTo(this.nom)==0){
            if (Part.getPrenom().compareTo(this.prenom)>0) {
                return -1;
            } else if (Part.getPrenom().compareTo(this.prenom)<0){
                return 1;    
            }
        }
        return 0;
    }
    
}
