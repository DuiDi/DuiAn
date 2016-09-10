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
    private int nbTotemsValidés = 0;
    private int nbVies = 3;
    private Vector<Totem> TotemsValidés = new Vector<Totem>();
    
    public Vector<String> ToString(){
        Vector<String> desc = new Vector<String>();
        
        desc.add("Joueur : "+this.nom);
        
        if(this.TotemsValidés.isEmpty()){
            desc.add("Aucun totem obtenu");
        }
        else{
            desc.add("Totems obtenus : ");
            
            for(Totem t: this.TotemsValidés){
                desc.add(t.toString());
            }
        }
        return desc;
    }
    
    //Permet d'obtenir le nom du joueur
    public String GetNom(){
        return this.nom;
    }
    
    //Permet d'obtenir le nombre de totems obtenus
    public int GetTotemsValidés(){
        return this.nbTotemsValidés;
    }
    
    //Permet d'obtenir le nombre de vies
    public int GetNbVies(){
        return this.nbVies;
    }
    
    //Permet de modifier le nom du joueur
    public void SetNom(String s){
        this.nom = s;
    }
    
    //Permet de modifier le nombre de totems obtenus
    public void SetTotemsValidés(int i){
        this.nbTotemsValidés = i;
    }
    
    //Permet de modifier le nombre de vie
    public void SetPlusVie(){
        this.nbVies++;
    }
    
    //Permet de remettre à zéro les informations du joueur
    public void Reset(){
        this.nbTotemsValidés = 0;
        this.nbVies = 3;
    }
    
    //Permet d'ajouter un totem au vector
    public void AjoutTotem(Totem t){
        this.TotemsValidés.add(t);
    }
}
