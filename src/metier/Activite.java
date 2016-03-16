/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.text.Collator;
import java.util.Locale;

/**
 *
 * @author jonathanraillard
 */
public class Activite {
    private int noAct;
    private String libelle;
    
    public Activite(int noAct, String libelle){
        this.noAct = noAct;
        this.libelle = libelle;
    }

    public int getNoAct() {
        return noAct;
    }

    public String getLibelle() {
        return libelle;
    }
    
    
    
    public String toString() {
        return libelle;
    }
    
    
    public int compareTo (Activite Act){
        Collator compareOperator = Collator.getInstance(Locale.FRENCH);
        compareOperator.setStrength(Collator.PRIMARY);
        if(Act.getLibelle().compareTo(this.libelle)>0){
               return -1;
        } else if(Act.getLibelle().compareTo(this.libelle)<0){
               return 1;             
        }
        return 0;
    }
    
    
    
}
