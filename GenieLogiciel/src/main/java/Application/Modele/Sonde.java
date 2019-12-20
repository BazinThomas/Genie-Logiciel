package Application.Modele;

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
    
    public Sonde()
    {
        this.temperature = 0;
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
