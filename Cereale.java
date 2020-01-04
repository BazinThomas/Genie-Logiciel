package Beuzelin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cereale 
{

    private double NoLot; 
    private String type;
    private int volume;
    private String qualite;
    private float TauxHumidite;
    private float temperature;

    //Constructeur
    public Cereale(double NL, String t, int v, String q, float th, float temp) throws Exception	
        {	
		this.NoLot=NL;
                this.type=t;
		this.volume=v;
                this.qualite=q;
                this.TauxHumidite=th;
                this.temperature=temp; 
                if(type.equals("Blé") || type.equals("Colza")|| type.equals("Orge")|| type.equals("Pois")|| type.equals("Proteagineux")){
                    
                }else
                    throw new Exception("Type de céréale invalide");
               
                if(volume<0)
                    throw new Exception("Volume invalide");
	}
    
    //Methodes
    public void Nettoyage(){
        
    }
    
    //Get-set 
    public double getNoLot()
	{
		return this.NoLot;
	}
    
    public void setNoLot(double Nolot) {
        this.NoLot = Nolot;
    }
    
    public String getType()
	{
		return this.type;
	}
    
    public void setType(String type) {
        this.type = type;
    }
    
    public int getVolume()
	{
		return this.volume;
	}
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public String getQualite()
	{
		return this.qualite;
	}
    
    public void setQualite(String qualite) {
        this.qualite = qualite;
    }
    
    public float getTauxHumidite()
	{
		return this.TauxHumidite;
	}
    
    public void setTauxHumidite(float TauxHumidite) {
        this.TauxHumidite = TauxHumidite;
    }
    
    public float getTemperature()
	{
		return this.temperature;
	}
    
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    
    @Override
    public String toString() {
        String res="";
        res+= "Cereale provonent du lot N° : "+ getNoLot()+"\n";
        res+= "est de type :" +getType() +"\n";
        res+= "sa qualité est : " +getQualite()+"\n"; 
        return res;
    }
    
    
}
