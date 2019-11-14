package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Alarme 
{

    private String cause;
    private boolean active;

    //Constructeur
    public Alarme(String c,boolean a) 
        {	
		this.cause=c;
                this.active=a;
	}
    
    //Methodes
    public void stopProcessus(){
        //protocole d'arret du processus? 
    }
    
    public void stopAlarme(){
       active=false;
	    
    }
    
    //Get-set 
    public String getCause()
	{
		return this.cause;
	}
    
    public void setCause(String cause) {
        this.cause = cause;
    }
    
    //Get-set 
    public boolean getActive()
	{
		return this.active;
	}
    
    public void setActive(boolean active) {
        this.active = active;
    }
 
}
