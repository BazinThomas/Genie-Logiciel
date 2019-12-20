package Application.Modele;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cellule extends Conteneur 
{
    private String typeCereale;
    private int volume;
    private boolean plein;
    
    //Constructeur
    public Cellule(String tc, int v, boolean p) 
        {	
		super(tc,v,p);
	}
}
