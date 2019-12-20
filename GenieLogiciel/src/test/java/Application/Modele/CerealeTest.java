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
public class CerealeTest {
   
    @Test
    public void TestGetVolume()
    {
        Cereale c = new Cereale();
        c.setVolume(12);
        int v = c.getVolume();
        Assert.assertEquals(12, v);
    }
    
   @Test
   public void testSetVolume()
   {
       Cereale c = new Cereale();
       c.setVolume(12);
       Assert.assertEquals(12,c.getVolume());
   }
   
   @Test
   public void testGetNoLot()
   {
       Cereale c = new Cereale();
       c.setNoLot(12);
       double l = c.getNoLot();
       Assert.assertEquals(12,l);
   }
   
   
   
   @Test
   public void testSetNoLot()
   {
       Cereale c = new Cereale();
       c.setNoLot(12);
       Assert.assertEquals(12, c.getNoLot());
   }
   
   @Test
   public void testGetType()
   {
       Cereale c = new Cereale();
       c.setType("default");
       String res = c.getType();
       Assert.assertEquals("default",res);
   }
   
   @Test
   public void testSetType()
   {
       Cereale c = new Cereale();
       c.setType("default");
       Assert.assertEquals("default",c.getType());
   }
   
   @Test
   public void testGetQualite()
   {
       Cereale c = new Cereale();
       c.setQualite("default");
       String res = c.getQualite();
       Assert.assertEquals("default", res);
   }
   
   @Test
   public void testSetQualite()
   {
       Cereale c = new Cereale();
       c.setQualite("bien");
       Assert.assertEquals("bien", c.getQualite());
   }
   
   @Test
   public void testGetTemperature()
   {
       Cereale c = new Cereale();
       c.setTemperature(12);
       float t = c.getTemperature();
       Assert.assertEquals(12,t);
   }
   
   @Test
   public void TestSetTemperature()
   {
       Cereale c = new Cereale();
       c.setTemperature(12);
       Assert.assertEquals(12, c.getTemperature());
   }
   
   @Test
   public void TestGetHumidite()
   {
       Cereale c = new Cereale();
       c.setTauxHumidite(12);
       float h = c.getTauxHumidite();
       Assert.assertEquals(12,h);
   }
   
   @Test
   public void TestSetHumidite()
   {
       Cereale c = new Cereale();
       c.setTauxHumidite(12);
       Assert.assertEquals(12,c.getTauxHumidite());
   }
   
   
}
