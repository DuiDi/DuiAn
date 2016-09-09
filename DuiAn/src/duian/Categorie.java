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
public class Categorie {
    private String nom;
    private Vector<Minijeu> jeux = new Vector<Minijeu>();
    protected Boolean Valide; 
    protected String path;
    
    //Initialisation de l'instance
    public Categorie(){
        
    }
    
    //Méthode permettant de récupérer le nom de la catégorie
    public String GetNom(){
        return this.nom;
    }
    
    //Méthode permettant de récupérer le chemin du dossier de la catégorie
    public String GetPath(){
        return this.path;
    }
    
    //Méthode permettant de modifier le nom de la catégorie
    public void SetNom(String s){
        this.nom = s;
    }
    
    //Méthode d'affichage des caractéristiques du mini jeu
   /* @Override
    public String toString(){
        String s = "Dans la catégorie"+this.nom+", il y a :\n";
        
        for(Minijeu mj : this.jeux){
            s += mj.toString();
        }
        
        return s;
    }*/
    
    //Méthode d'ajout d'un mini-jeu dans le vecteur
    public void AjoutMinijeu(Minijeu mj){
        this.jeux.add(mj);
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
}
