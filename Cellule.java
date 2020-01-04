package Beuzelin;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.util.ArrayList;

public class Cellule extends Conteneur 
{
    private Date nettoyage;
    private Date ventilation;
    private Date traitement;
    private int num;
    private Sonde sonde;
    
    
    //Constructeur
    public Cellule() {	
        super();
        this.ventilation=null;
        this.nettoyage=null;
        this.traitement=null;
        this.num=0;
        this.sonde=null;
	}
    
    public Cellule(InfoCereales info, int pm, Date n, Date v, Date t, int num, Sonde son){
        super(info, pm);
        this.ventilation=v;
        this.nettoyage=n;
        this.traitement=t;
        this.num=num;
        this.sonde=son;
    }

    public Date getNettoyage() {
        return nettoyage;
    }

    public void setNettoyage(Date nettoyage) {
        this.nettoyage = nettoyage;
    }

    public Date getVentilation() {
        return ventilation;
    }

    public void setVentilation(Date ventilation) {
        this.ventilation = ventilation;
    }

    public Date getTraitement() {
        return traitement;
    }

    public void setTraitement(Date traitement) {
        this.traitement = traitement;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Sonde getSonde() {
        return sonde;
    }

    public void setSonde(Sonde sonde) {
        this.sonde = sonde;
    }
    
}
