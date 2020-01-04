/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beuzelin;

public class Controleur {
        
    private Silo silo;
        
    public Controleur(){
        silo=new Silo();
        silo.init();
    }

    public Silo getSilo() {
        return silo;
    }
    
    
}
