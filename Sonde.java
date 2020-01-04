package Beuzelin;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sonde 
{

    private int temperature;

    //Constructeur
    public Sonde(int t) 	
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
    public int getTemperature()
	{
		return this.temperature;
	}
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "T : " + temperature;
    }

}
