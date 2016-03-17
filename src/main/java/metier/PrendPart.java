/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author jonathanraillard
 */
public class PrendPart {
    int noPart;
    int noAct;
    
    public PrendPart(int noPart, int noAct){
        this.noPart = noPart;
        this.noAct = noAct;
    }

    public int getNoPart() {
        return noPart;
    }

    public int getNoAct() {
        return noAct;
    }

    public String toString() {
        return "PrendPart{" + "noPart=" + noPart + ", noAct=" + noAct + '}';
    }
    
    
    
}
