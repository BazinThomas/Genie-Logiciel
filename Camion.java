package fr.ufrsciencestech.panier;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Camion 
{

    private int id;
    private String typeContenu;
    private String typeTransport;
    private int volumeContenu;
    private boolean vide;

    //Constructeur
    public Camion(int id, String tc, String tt, int vc, boolean v) 
        {	
		this.id=id;
                this.typeContenu=tc;
                this.typeTransport=tt;
                this.volumeContenu=vc;
                this.vide=v;
	}
    
    //Methodes
    public void Depose(){
        
    }
    
    //Get-set 
    public int getId()
	{
		return this.id;
	}
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTypeContenu()
	{
		return this.typeContenu;
	}
    
    public void setTypeContenu(String TypeContenu) {
        this.typeContenu = TypeContenu;
    }
    
    public String getTypeTransport()
	{
		return this.typeTransport;
	}
    
    public void setTypeTransport(String TypeTransport) {
        this.typeTransport = TypeTransport;
    }
    
    public int getVolumeContenu()
	{
		return this.volumeContenu;
	}
    
    public void setVolumeContenu(int VolumeContenu) {
        this.volumeContenu = VolumeContenu;
    }
    
    public boolean getVide()
	{
		return this.vide;
	}
    
    public void setVide(boolean Vide) {
        this.vide = Vide;
    }
    
}
