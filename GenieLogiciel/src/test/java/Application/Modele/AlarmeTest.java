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
public class AlarmeTest {
    
    @Test
    public void testGetCause()
    {
        Alarme a = new Alarme();
        a.setCause("default");
        String c = a.getCause();
        Assert.assertEquals("default", c);
    }
    
    @Test
    public void testSetCause()
    {
        Alarme a = new Alarme();
        a.setCause("default");
        Assert.assertEquals("default",a.getCause());
    }
    
    @Test
    public void testGetActive()
    {
        Alarme a = new Alarme();
        a.setActive(true);
        boolean b = a.getActive();
        Assert.assertEquals(true,b);
    }
    
    @Test
    public void testSetActive()
    {
        Alarme a = new Alarme();
        a.setActive(true);
        Assert.assertEquals(true, a.getActive());
    }
}
