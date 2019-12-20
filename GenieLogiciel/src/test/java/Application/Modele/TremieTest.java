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
public class TremieTest {
    
    @Test
    public void testGetPlein()
    {
        Tremie a = new Tremie();
        a.setPlein(true);
        boolean b = a.getPlein();
        Assert.assertEquals(true,b);
    }
    
    @Test
    public void testSetPlein()
    {
        Tremie a = new Tremie();
        a.setPlein(true);
        Assert.assertEquals(true, a.getPlein());
    }
    
}
