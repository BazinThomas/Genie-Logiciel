package Application.Modele;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Conteneur 
{

    private String typeCereale;
    private int volume;
    private boolean plein;
    
    //Constructeur
    public Conteneur(String tc, int v, boolean p) 
        {	
		this.typeCereale=tc;
                this.volume=v;
                this.plein=p;
	}
    
    public Conteneur()
    {
        this.typeCereale = "default";
        this.volume = 0;
        this.plein = true;
    }
    
    //Methodes
    public void remplir(){
        
    }
    
    public void vider(){
        
    }
    
    //Get-set 
    public String getTypeCereale()
	{
		return this.typeCereale;
	}
    
    public void setTypeCereale(String TypeCereale) {
        this.typeCereale = TypeCereale;
    }
    
    public int getVolume()
	{
		return this.volume;
	}
    
    public void setVolume(int Volume) {
        this.volume = Volume;
    }
    
    public boolean getPlein()
	{
		return this.plein;
	}
    
    public void setPlein(boolean Plein) {
        this.plein = Plein;
    }
    
    
}
