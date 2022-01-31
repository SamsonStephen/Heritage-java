package Heritage_java;

/**
 * Classe Mère
 * 
 */
public class Ordinateur {
    protected int Reference;
    protected String Processeur;
    protected String RAM;
    protected String Disque_dur;
    protected String Systeme_exploitation;
    protected int Prix_vente;
    
    public Ordinateur(int ref,String processeur,String RAM,String disque_dur,String system,int prix){
        super();
        Reference = ref;
        Processeur = processeur;
        this.RAM = RAM;
        Disque_dur = disque_dur;
        Systeme_exploitation = system;
        Prix_vente = prix;
    }
    public String toString(){
        String montrer ="Référence : " + Reference + "; Processeur : " + Processeur +"; RAM : "+ RAM + "; Disque-Dur : " + Disque_dur +"; Système d'exploitation : " + Systeme_exploitation +"; Prix = " + Prix_vente;
        return montrer;
    }
}
