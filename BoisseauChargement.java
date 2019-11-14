package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BoisseauChargement extends Conteneur 
{
    private String typeCereale;
    private int volume;
    private boolean plein;
    
    //Constructeur
    public BoisseauChargement(String tc, int v, boolean p) 
        {	
		super(tc,v,p);
	}
}
