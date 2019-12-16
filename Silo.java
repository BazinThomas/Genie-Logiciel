package Beuzelin;

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
    
    Silo _s1 = new Silo ("tout_type",10,1370);
    
    Cellule _cel1   = new Cellule ("blé", 410, false);
    Cellule _cel2   = new Cellule ("blé", 410, false);
    Cellule _cel3   = new Cellule ("blé", 570, false);
    Cellule _cel4   = new Cellule ("orge", 498, false);
    Cellule _cel5   = new Cellule ("poids", 984, false);
    Cellule _cel6   = new Cellule ("poids", 651, false);
    Cellule _cel7   = new Cellule ("colza", 1370, true);
    Cellule _cel8   = new Cellule ("colza", 1370, true);
    Cellule _cel9   = new Cellule ("colza", 1000, false);
    Cellule _cel10  = new Cellule ("proteagineux", 570, false); 
    
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
