/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duian;

/**
 *
 * @author DydyBook
 */
public class Totem {
    private String nom;
    private String element;
    private String categorie;
    
    //Initialisation paramètre
    public Totem(String nomTotem, String nomCategorie, String element){
        this.nom = nomTotem;
        this.categorie = nomCategorie;
        this.element = element;
    }
    
    @Override
    public String toString(){
        String s = "Trésor : "+this.nom+" ";
        
        if(this.element.compareTo("Eau") == 0){
            s += "de l'eau";
        }
        else if(this.element.compareTo("Feu") == 0){
            s += "du feu";
        }
        if(this.element.compareTo("Terre") == 0){
            s += "de la terre";
        }
        if(this.element.compareTo("Bois") == 0){
            s += "du bois";
        }
        if(this.element.compareTo("Métal") == 0){
            s += "du métal";
        }
        return s+"\n";
    }
    
    //Renvoie le nom de l'animal
    public String GetNom(){
        return this.nom;
    }
    
    //Renvoie l'élément de l'animal
    public String GetElement(){
        return this.element;
    }
    
}
