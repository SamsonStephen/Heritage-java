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
public class OrdiBureau extends Ordinateur{
    protected String Carte_graphique;
    protected String chipset;
    protected String clavier;
    
    public OrdiBureau(int ref,String processeur,String RAM,String disque_dur,String system,int prix,String graphique, String chipset, String clavier){
        super(ref,processeur,RAM,disque_dur,system,prix);
        Carte_graphique = graphique;
        this.chipset = chipset;
        this.clavier = clavier;
    }
    public String toString(){
        String montrer ="Ordinateur de bureau. Référence : " + Reference + "; Processeur : " + Processeur +"; RAM : "+ RAM + "; Disque-Dur : " + Disque_dur +"; Système d'exploitation : " + Systeme_exploitation +"; Prix = " + Prix_vente+"Carte Graphique : "+Carte_graphique+"; Chipset : "+ chipset + "; Clavier : "+ clavier;
        return montrer;
    }
}
