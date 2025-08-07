import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* This is the test class for the Ring Torus program.
*
* Project 7A
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 10/13/2022
*/
public class RingTorusTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
   * Tests getter methods.
   */
   @Test public void getters() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("label incorrect", "tester", tester.getLabel());
      Assert.assertEquals("large radius incorrect", 4.0,
         tester.getLargeRadius(), .01);
      Assert.assertEquals("small radius incorrect", 2.0,
         tester.getSmallRadius(), .01);
   } 
   /**
   * Tests the setter methods. 
   */
   @Test public void setters() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals(false, tester.setLabel(null));
      Assert.assertEquals(true, tester.setLabel("tester"));
      Assert.assertEquals(false, tester.setLargeRadius(-4.0));
      Assert.assertEquals(true, tester.setLargeRadius(4.0));
      Assert.assertEquals(false, tester.setSmallRadius(-2.0));
      Assert.assertEquals(true, tester.setSmallRadius(2.0));
   }
   /**
   * Tests the diameter method.
   */
   @Test public void diameter() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("Diameter incorrect",
         12.0, tester.diameter(), 0.01);
   }
/** 
* Tests the surface area method.
*/
   @Test public void surfaceArea() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("Surface Area incorrect",
         315.827, tester.surfaceArea(), 0.01);
   }
/**
* Tests the volume method.
*/
   @Test public void volume() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("Volume incorrect", 315.827, tester.volume(), 0.01);
   }
/** 
* Tests the toString method. 
*/
   @Test public void stringTester() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("toString incorrect", true, tester.toString()
          .contains("RingTorus \"tester" + "\"\n"
          + "\tlarge radius = 4.0 units\n" 
          + "\tsmall radius = 2.0 units\n"
          + "\tdiameter = 12.0 units\n" 
          + "\tsurface area = 315.827 square units\n"
          + "\tvolume = 315.827 cubic units"));
   }
/** 
* Tests the getCount method. 
*/
   @Test public void countGetter() {
      RingTorus.resetCount();
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("getCount incorrect", 1, tester.getCount());
   }
   /** 
   * Tests the resetCount method. 
   */
   @Test public void resetCounter() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      RingTorus.resetCount();
      RingTorus tester2 = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("resetCount", 1, RingTorus.getCount());
   }
       /** 
       * Tests the equal method. 
       */
   @Test public void equal() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      RingTorus tester2 = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("equals incorrect", true, tester.equals(tester2));
      tester2 = new RingTorus("Not tester", 4.0, 2.0);
      Assert.assertEquals("equals incorrect", false, tester.equals(tester2));
      tester2 = new RingTorus("tester", 1.0, 4.0);
      Assert.assertEquals("equals incorrect", false, tester.equals(tester2));
      tester2 = new RingTorus("tester", 2.0, 3.0);
      Assert.assertEquals("equals incorrect", false, tester.equals(tester2));
      Assert.assertEquals("equals incorrect", false, tester.equals(2));
   }
/** 
* Tests the hashCode method. 
*/
   @Test public void hashcode() {
      RingTorus tester = new RingTorus("tester", 4.0, 2.0);
      Assert.assertEquals("hashCode incorrect", 0, tester.hashCode());
   }
}


