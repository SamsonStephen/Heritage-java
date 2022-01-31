/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heritage_java;
import java.util.ArrayList;
/**
 *
 * @author test
 */
public class Heritage {
    
    public static ArrayList <Ordinateur> ordi = new ArrayList <Ordinateur>();
    public static void main(String[] args) {
        Netbook monNetbook = new Netbook (11543178, "Jet", "RAM 241", "WD Blue", "Linux", 1520,25, 25,true,false);
        Portable monPortable = new Portable (11543178, "Jet", "RAM 241", "WD Blue", "Linux", 1520,15, 18, true, true);
        OrdiBureau monOrdiBureau = new OrdiBureau(11543178, "Jet", "RAM 241", "WD Blue", "Linux", 1520,"Beatiful 2000","Chipset v15","Clavier classique");
        ordi.add(monNetbook);
        ordi.add(monPortable);
        ordi.add(monOrdiBureau);
        for (int i = 0; i< ordi.size(); i ++){
            System.out.println(ordi.get(i));
        }
    }  
    
}
