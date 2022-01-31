/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage_java;

/**
 *
 * @author test
 */
public class Netbook extends Ordinateur{
    protected int taille_ecran;
    protected int poids;
    protected boolean Webcam;
    protected boolean lecteur_carte_memoire;
    
    public Netbook(int ref,String processeur,String RAM,String disque_dur,String system,int prix,int taille, int poids, boolean webcam, boolean lecteur){
        super(ref,processeur,RAM,disque_dur,system,prix);
        taille_ecran = taille;
        this.poids =poids;
        Webcam = webcam;
        lecteur_carte_memoire = lecteur;
    }
    
    public String toString(){
       String montrer = "Netbook. Référence : " + Reference + "; Processeur : " + Processeur +"; RAM : "+ RAM + "; Disque-Dur : " + Disque_dur +"; Système d'exploitation : " + Systeme_exploitation +"; Prix = " + Prix_vente+"Taille-ecran : "+ taille_ecran +"pouce; Poids : " + poids +"Kg; Possedant une webcam : "+ Webcam +"; Possedant un lecteur de carte mémoire : " + lecteur_carte_memoire;
       return montrer;
    }
}
