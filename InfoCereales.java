/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beuzelin;

public class InfoCereales {
    private String categorie;
    private int poids;
    private String qualite;
    private int numLot;
    private int volume;
    
    public InfoCereales(){
        this.categorie="";
        this.poids=0;
        this.qualite="";
        this.numLot=0;
        this.volume=0;
    }
    
    public InfoCereales(String c, int p, String q, int n, int v){
        this.categorie=c;
        this.poids=p;
        this.qualite=q;
        this.numLot=n;
        this.volume=v;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public String getQualite() {
        return qualite;
    }

    public void setQualite(String qualite) {
        this.qualite = qualite;
    }

    public int getNumLot() {
        return numLot;
    }

    public void setNumLot(int numLot) {
        this.numLot = numLot;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "InfoCereales{" + "categorie=" + categorie + ", poids=" + poids + ", qualite=" + qualite + ", numLot=" + numLot + ", volume=" + volume + '}';
    }

    
}
