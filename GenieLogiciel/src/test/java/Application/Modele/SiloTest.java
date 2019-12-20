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
public class SiloTest {
    
    
     
    
    @Test
    public void testGetTypeCereale()
    {
        Silo s = new Silo();
        s.setTypeCereale("default");
        String res = s.getTypeCereale();
        Assert.assertEquals("default",res);
    }
    
    @Test
    public void testSetTypeCereale()
    {
        Silo s = new Silo();
        s.setTypeCereale("default");
        Assert.assertEquals("default", s.getTypeCereale());
    }
    
    
}
