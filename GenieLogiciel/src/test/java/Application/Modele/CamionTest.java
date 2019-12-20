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
public class CamionTest {
    
    @Test
    public void testGetId()
    {
        Camion c = new Camion();
        c.setId(0);
        int i = c.getId();
        Assert.assertEquals(0,i); 
    }
    
    @Test
    public void testSetId()
    {
        Camion c = new Camion();
        c.setId(0);
        Assert.assertEquals(0, c.getId());
    }
    
    @Test
    public void testGetTypeContenu()
    {
        Camion c = new Camion();
        c.setTypeContenu("default");
        String tc = c.getTypeContenu();
        Assert.assertEquals("default",tc);
    }
    
    @Test
    public void testSetTypeContenu()
    {
        Camion c = new Camion();
        c.setTypeContenu("default");
        Assert.assertEquals("default",c.getTypeContenu());
    }
    
    @Test
    public void testGetTypeTransport()
    {
        Camion c = new Camion();
        c.setTypeTransport("default");
        String tt = c.getTypeTransport();
        Assert.assertEquals("default", tt);
    }
    
    @Test
    public void testSetTypeTransport()
    {
        Camion c = new Camion();
        c.setTypeTransport("default");
        Assert.assertEquals("default", c.getTypeTransport());
    }
    
    @Test
    public void testGetVolumeContenu()
    {
        Camion c = new Camion();
        c.setVolumeContenu(0);
        int vc = c.getVolumeContenu();
        Assert.assertEquals(0, vc);
    }
    
    @Test
    public void testSetVolumeContenu()
    {
        Camion c = new Camion();
        c.setVolumeContenu(0);
        Assert.assertEquals(0, c.getVolumeContenu());
    }
    
    @Test
    public void testGetVide()
    {
        Camion c = new Camion();
        c.setVide(true);
        boolean v = c.getVide();
        Assert.assertEquals(true,v);
    }
    
    @Test
    public void testSetVide()
    {
        Camion c = new Camion();
        c.setVide(false);
        Assert.assertEquals(false,c.getVide());
    }
}
