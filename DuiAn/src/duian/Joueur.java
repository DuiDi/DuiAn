/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duian;

import java.util.Vector;

/**
 *
 * @author DydyBook
 */
public class Joueur {
    private String nom;
    private int nbTotemsValidés;
    private Vector<Totem> TotemsValidés = new Vector<Totem>();
    
    @Override
    public String toString(){
        String s = "Joueur : "+this.nom+"\nTotems obtenus : \n";
        for(Totem t: this.TotemsValidés){
            s += t.toString();
        }
        return s;
    }
    
    //Permet d'obtenir le nom du joueur
    public String GetNom(){
        return this.nom;
    }
    
    //Permet d'obtenir le nombre de totems obtenus
    public int GetTotemsValidés(){
        return this.nbTotemsValidés;
    }
    
    //Permet de modifier le nom du joueur
    public void SetNom(String s){
        this.nom = s;
    }
    
    //Permet de modifier le nombre de totems obtenus
    public void SetTotemsValidés(int i){
        this.nbTotemsValidés = i;
    }
}
