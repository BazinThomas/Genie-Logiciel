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
public class SondeTest {
    
    @Test
    public void testGetTemperature()
    {
        Sonde s = new Sonde();
        s.setTemperature(0);
        float f = s.getTemperature();
        Assert.assertEquals(0,f);
    }
    
    @Test
    public void testSetTemperature()
    {
        Sonde s = new Sonde();
        s.setTemperature(0);
        Assert.assertEquals(0,s.getTemperature());
    }
    
}
