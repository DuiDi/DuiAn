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
    private String[] question   ;
    private String[] reponse    ;
    private String[] aide       ;
    private String[][] choix    ;
    
    //Initiliation des paramètres
    public QCM(){
        //Variables locales
        String[] temp      ;
        int i = 0          ;
        
        //Ouverture en lecture d'un fichier
        try (BufferedReader bufrd = new BufferedReader(new FileReader(super.path+"_qcm.doc"))){
            
            String ligne                    ;
            
            //Lecture ligne par ligne
            while ((ligne = bufrd.readLine()) != null) {
                temp = ligne.split(";")     ; //Découpage de la ligne à chaque point-virgule
                this.question[i] = temp[0]  ; //Récupération de la première partie de la ligne
                this.reponse[i] = temp[1]   ; //Récupération de la deuxième partie de la ligne
                this.choix[i] = temp[2].split("\t"); //Récupération de la troisième partie de la ligne
                this.aide[i] = temp[3]      ; //Récupération de la quatrième partie de la ligne
                
                i++                         ;
            }
            bufrd.close()                   ;
        } 
        //Affichage erreur si erreur
        catch (IOException e) {
            e.getMessage()                  ; 
        }
    }
    
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
}
