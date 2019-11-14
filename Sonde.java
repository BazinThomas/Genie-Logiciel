package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sonde 
{

    private float temperature;

    //Constructeur
    public Sonde(float t) 	
        {	
		this.temperature=t;
	}
    
    //Methodes
    public void transmission(){
        
    }
    
    public int RecupTemperature(){
        return 0;
    }
    
    //Get-set 
    public float getTemperature()
	{
		return this.temperature;
	}
    
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
 
}
