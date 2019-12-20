package Application.Modele;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

public class Silo 
{

    private String typeCereale;
    private int nbCellule;
    private int hauteurCereale;
    private ArrayList<Cellule> cellule = new ArrayList<Cellule>();
    
    //Constructeur
    public Silo(String tc, int nbc, int hc) 
        {	
		this.typeCereale=tc;
                this.nbCellule=nbc;
                this.hauteurCereale=hc;
	}
    
    public Silo()
    {
        this.typeCereale = "default";
        this.nbCellule = 0;
        this.hauteurCereale = 0;
    }
    
    //Methodes
    public void Nettoyage(){
        
    }
    
    public void Ventilation(){
        
    }
    
    //Get-set 
    public String getTypeCereale()
	{
		return this.typeCereale;
	}
    
    public void setTypeCereale(String TypeCereale) {
        this.typeCereale = TypeCereale;
    }
    
    public int getNbCellule()
	{
		return this.nbCellule;
	}
    
    public void setTypeContenu(int NbCellule) {
        this.nbCellule = NbCellule;
    }
    
    public int getHauteurCereale()
	{
		return this.hauteurCereale;
	}
    
    public void setHauteurCereale(int HauteurCereale) {
        this.hauteurCereale = HauteurCereale;
    }
    
    
}
