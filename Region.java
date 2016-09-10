/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duian;

import java.util.Stack;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author DydyBook
 */
public class Region {
    private String nom;
    private Vector<Totem> totems = new Vector<>();
    public Vector<Categorie> categories = new Vector<Categorie>();
    private Boolean validé;
    
    //Méthode d'affichage des caractéristiques du mini jeu
    @Override
    public String toString(){
        String s = "Dans la région"+this.nom+", il y a 5 animaux totems:\n";
        
        for(Totem t : this.totems){
            s += t.toString();
        }
        
        return s;
    }
    
    //Méthode permettant de récupérer le nom de la région
    public String GetNom(){
        return this.nom;
    }
    
    //Méthode permettant de renvoyer dans un vecteur de strings les descriptions des totems
    public Vector<String> GetTotems(){
        Vector<String> vecTotems = new Vector<String>();
        
        for(Totem t : this.totems){
            String s = t.toString();
            vecTotems.add(s);
        }
        return vecTotems;
    }
    
    //Méthode permettant de modifier le nom de la région
    public void SetNom(String s){
        this.nom = s;
    }
    
    //Méthode d'ajout de totems
    public void AjoutTotems(Totem t){
        this.totems.add(t);
    }
    
    //Permet d'ajouter des catégories à partir d'un tableau de Strings
    public void AjoutCategories(String[] tabCategories){
        
        for (int i = 0 ; i < 5; i++){
            Categorie c  = new Categorie();
            c.SetNom(tabCategories[i]);
            this.categories.add(c);
        }
    }
    
    //Permet d'ajouter au vector de totems les totems de ses catégories
    public void SetTotemsParCategorie(String nomAnimal){
        String[] elements = {"Eau", "Feu","Terre","Bois","Metal"};
        int i = 0;
        for (Categorie c : this.categories){
            Totem t = new Totem(nomAnimal, c.GetNom(), elements[i]);
            c.SetAnimal(t);
            this.totems.add(t);
            i++;
        }
    }
    
}
