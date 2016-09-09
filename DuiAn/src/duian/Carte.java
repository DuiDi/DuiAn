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
public class Carte {
    String[] regions = {"Langue", "Histoire et Géographie", "Us et Coutumes","Culture pop moderne"};
    String[] regionNord = {"Clés", "Salutation", "Chiffres","Couleurs", "Villes de Chine et pays"};
    String[] regionSud = {"Géographie physique", "Géopolitique", "Grandes batailles et événéments marquants","Personnages célèbres", "Art & Littérature"};
    String[] regionEst = {"Fêtes chinoises", "Politesse", "Conversation","Ethnies", "Religion"};
    String[] regionOuest = {"Région du Nord", "Région du Sud", "Région de l'Ouest","Région de l'Est", "Région du Centre"};
    
    //Renvoie le tableau des catégories corrrespondant
    public String[] GetRegionSpec(String s){
        String[] aRetourner = new String[5];
        
        if (s.compareTo("Langue") == 0){
            aRetourner = regionNord;
        }
        else if (s.compareTo("Histoire et Géographie") == 0){
            aRetourner = regionSud;
        }
        else if (s.compareTo("Us et Coutumes") == 0){
            aRetourner = regionEst;
        }
        else if (s.compareTo("Culture pop moderne") == 0){
            aRetourner = regionOuest;
        }
        return aRetourner;
    }
    
    
    //Renvoie le tableau des régions
    public String[] GetRegions(){
        return regions;
    }
}
