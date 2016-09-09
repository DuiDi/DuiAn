/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duian;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author DydyBook
 */
public class QCM extends Minijeu{
    public String[] question   = new String[5];
    public String[] reponse   = new String[5] ;
    public String[] aide       = new String[5];
    public String[][] choix    = new String[5][4];
    
    //Récupération des données fichier
    public void SetQCM(String path){
        //Variables locales
        String[] temp      ;
        int i = 0          ;
        
        //Ouverture en lecture d'un fichier
        try (BufferedReader bufrd = new BufferedReader(new FileReader(path+"_qcm.txt"))){
            
            String ligne                    ;
            
            //Lecture ligne par ligne
            while (((ligne = bufrd.readLine()) != null) && (i<5)) {
                temp = ligne.split(";")     ; //Découpage de la ligne à chaque point-virgule
                this.question[i] = temp[0]  ; //Récupération de la première partie de la ligne
                this.choix[i] = temp[1].split("_"); //Récupération de la deuxième partie de la ligne
                this.reponse[i] = temp[2]   ; //Récupération de la troisième partie de la ligne
                this.aide[i] = temp[3]      ; //Récupération de la quatrième partie de la ligne*/
                
                i++                         ;
            }
            bufrd.close()                   ;
        } 
        //Affichage erreur si erreur
        catch (IOException e) {
            System.out.println(e.getMessage())                  ; 
        }
    }
    
   /* public String toString(int i){
        //return "Question n°"+i+this.question[i]+"\n"+this.reponse[i]+"\n"+this.choix+"\n"+this.aide+"\n";
    }*/
    
    //Methode de validation de l'objet
    @Override
    public void SetValide(Boolean b){
        this.Valide = b                     ;
    }
    
    //Renvoie le tableau de questions
    public String[] GetQuestions(){
        return this.question;
    }

    //Renvoie le tableau de réponses
    public String[] GetReponses(){
        return this.reponse;
    }

    //Renvoie le tableau de tableau de choix
    public String[][] GetChoix(){
        return this.choix;
    }

    //Renvoie le tableau de messages d'aide
    public String[] GetAides(){
        return this.aide;
    }
    
    //Modifie le tableau de 
    public void SetQuestions(String[] s){
        this.question = s;
    }
    
    //Modifie le tableau de 
    public void SetReponses(String[] s){
        this.reponse = s;
    }
    
    //Modifie le tableau de 
    public void SetChoix(String[][] s){
        this.choix = s;
    }
    
    //Modifie le tableau de 
    public void SetAides(String[] s){
        this.aide = s;
    }
}
