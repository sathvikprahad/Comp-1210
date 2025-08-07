import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* Tests the Pie Class.
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public class PieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests getCrustCost method. **/
   @Test public void getCrustCostTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
          "flour", "sugar", "apples", "cinnamon", 
          "butter", "baking soda", "salt"); 
      Assert.assertEquals(0.0, p1.getCrustCost(), 0.001);
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0, 
             "flour", "sugar", "lime juice", "lemon juice", 
             "graham crackers", "butter", "baking soda", "salt"); 
      Assert.assertEquals(2.0, p2.getCrustCost(), 0.001);
   }
   /** Tests setCrustCost method. **/
   @Test public void setCrustCostTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
          "flour", "sugar", "apples", "cinnamon", 
          "butter", "baking soda", "salt"); 
      p1.setCrustCost(0.0);
      Assert.assertEquals(0.0, p1.getCrustCost(), 0.001);
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0, 
             "flour", "sugar", "lime juice", "lemon juice", 
             "graham crackers", "butter", "baking soda", "salt"); 
      p1.setCrustCost(2.0);
      Assert.assertEquals(2.0, p2.getCrustCost(), 0.001);
   }

  /** Tests price of pie. **/
   @Test public void priceTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
          "flour", "sugar", "apples", "cinnamon", 
          "butter", "baking soda", "salt");
      Assert.assertEquals(12.00, p1.price(), 0.001);
      Pie p2 = new Pie("Summer Special", "Key Lime", 1, 2.0, 
             "flour", "sugar", "lime juice", "lemon juice", 
             "graham crackers", "butter", "baking soda", "salt"); 
      Assert.assertEquals(14.00, p2.price(), 0.001);
   }
}

