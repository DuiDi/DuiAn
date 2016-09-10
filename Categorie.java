/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duian;

import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DydyBook
 */
public class Categorie {
    private String nom;
    protected Boolean Valide; 
    protected String path;
    private Totem animal;
    
    //Méthode permettant de récupérer le nom de la catégorie
    public String GetNom(){
        return this.nom;
    }
    
    //Méthode permettant de récupérer le chemin du dossier de la catégorie
    public String GetPath(){
        return this.path;
    }
    
    //Renvoie l'animal du quiz en cours
    public Totem GetAnimal(){
        return this.animal;
    }
    
    //Renvoie la valeur de validé
    public Boolean GetValide(){
        return this.Valide;
    }
    
    //Méthode permettant de modifier le nom de la catégorie
    public void SetNom(String s){
        this.nom = s;
    }
    
    //Méthode d'affichage des caractéristiques du mini jeu
    @Override
    public String toString(){
        String s = "Dans la catégorie"+this.nom+", il y a 5 animaux totems:\n";
        return s;
    }
    
    //Méthode permettant de modifier le nom de la catégorie
    public void SetCategorie(String s){
        this.nom = s;
    }
    
    //Méthode permettant de valider l'ensemble des mini-jeux de la catégorie
    public void SetValide(Boolean b){
        this.Valide = b;
    }
    
    //Méthode de modification du chemin pour accès dossier et fichiers
    public void SetPath(String s){
        this.path = s;
    }
    
    //Permet de modifier l'animal du quiz
    public void SetAnimal(Totem t){
        this.animal = t;
    }
    
}
