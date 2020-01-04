package Beuzelin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conteneur 
{

    private InfoCereales info;
    private int poidsMax;
    
    //Constructeur
    public Conteneur(){	
        this.info=null;
        this.poidsMax=0;
    }
    
    public Conteneur(InfoCereales i, int pm){
        this.info=i;
        this.poidsMax=pm;
    }
    
    //Methodes
    public void remplir(){
        
    }
    
    public void vider(){
        
    }

    public InfoCereales getInfo() {
        return info;
    }

    public void setInfo(InfoCereales info) {
        this.info = info;
    }

    public int getPoidsMax() {
        return poidsMax;
    }

    public void setPoidsMax(int poidsMax) {
        this.poidsMax = poidsMax;
    }
    
    
}
