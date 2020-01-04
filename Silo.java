package Beuzelin;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Math;

public class Silo 
{

    private ArrayList<Cellule> cellule;
    private ArrayList<InfoCereales> infocere;
    
    //Constructeur
    public Silo() 
        {   
            cellule = new ArrayList();
            infocere = new ArrayList();
	}

    
    //Methodes
    public void init(){
            Date date = new Date();
           
            InfoCereales info1 = new InfoCereales("blé",2,"bon",2,330);
            infocere.add(info1);
            Cellule _cel1 = new Cellule (info1, 410, date, date, date, 1, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel1);
            
            InfoCereales info2 = new InfoCereales("blé",1,"mauvais",5,25);
            infocere.add(info2);
            Cellule _cel2 = new Cellule (info2, 410, date, date, date, 2, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel2);
            
            InfoCereales info3 = new InfoCereales("blé",3,"très bon",62,45);
            infocere.add(info3);
            Cellule _cel3 = new Cellule (info3, 410, date, date, date, 3, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel3);
            
            InfoCereales info4 = new InfoCereales("orge",2,"bon",3,25);
            infocere.add(info4);
            Cellule _cel4 = new Cellule (info4, 612, date, date, date, 4, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel4);
            
            InfoCereales info5 = new InfoCereales("pois",3,"bon",13,625);
            infocere.add(info5);
            Cellule _cel5 = new Cellule (info5, 984, date, date, date, 5, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel5);
            
            InfoCereales info6 = new InfoCereales("pois",4,"mauvais",23,100);
            infocere.add(info6);
            Cellule _cel6 = new Cellule (info6, 651, date, date, date, 6, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel6);
            
            InfoCereales info7 = new InfoCereales("colza",2,"bon",4,1000);
            infocere.add(info7);
            Cellule _cel7 = new Cellule (info7, 1370, date, date, date, 7, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel7);
            
            InfoCereales info8 = new InfoCereales("colza",3,"très bon",7,989);
            infocere.add(info8);
            Cellule _cel8 = new Cellule (info8, 1370, date, date, date, 8, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel8);
            
            InfoCereales info9 = new InfoCereales("colza",1,"mauvais",9,25);
            infocere.add(info9);
            Cellule _cel9 = new Cellule (info9, 1000, date, date, date, 9, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel9);
            
            InfoCereales info10 = new InfoCereales("proteagineux",2,"bon",11,325);
            infocere.add(info10);
            Cellule _cel10 = new Cellule (info10, 570, date, date, date, 10, new Sonde((int)(15 + (Math.random() * (25 - 15) ) ) ));
            cellule.add(_cel10);
    }
    
    public void Nettoyage(){
        
    }
    
    public void Ventilation(){
        
    }
    
    //Get-set 
    
    public int getNbCellule()
	{
		return cellule.size();
	}
    
    public Cellule getCellule(int v){
        return cellule.get(v);
    }
    
    public InfoCereales getInfo(int v){
        return infocere.get(v);
    }

}
