/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.Modele;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dortp
 */
public class ConteneurTest {
    
    @Test
    public void testGetPlein()
    {
        Conteneur c = new Conteneur();
        c.setPlein(true);
        boolean b = c.getPlein();
        Assert.assertEquals(true,b);
    }
    
    @Test
    public void testSetPlein()
    {
        Conteneur c = new Conteneur();
        c.setPlein(true);
        Assert.assertEquals(true, c.getPlein());
    }
    
    @Test
    public void testGetVolume()
    {
        Conteneur c = new Conteneur();
        c.setVolume(0);
        int v = c.getVolume();
        Assert.assertEquals(0,v);
    }
    
    @Test
    public void testSetVolume()
    {
        Conteneur c = new Conteneur();
        c.setVolume(0);
        Assert.assertEquals(0,c.getVolume());
    }
    
    @Test
    public void testGetTypeCereale()
    {
        Conteneur c = new Conteneur();
        c.setTypeCereale("default");
        String s = c.getTypeCereale();
        Assert.assertEquals("default",s);
    }
    
    @Test
    public void testSetTypeCereale()
    {
        Conteneur c = new Conteneur();
        c.setTypeCereale("default");
        Assert.assertEquals("default", c.getTypeCereale());
    }
}
