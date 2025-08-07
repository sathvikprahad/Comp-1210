import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* Tests the Cake Class.
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/

public class CakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests getLayers method. **/
   @Test public void getLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
              "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
              "butter", "baking soda", "baking powder", "salt"); 
      Assert.assertEquals(1, c1.getLayers(), 0.001);
      Cake c2 = new Cake("2-Layer", "Red Velvet", 1, 2, 
              "flour", "sugar", "cocoa powder", "food coloring",  
              "eggs", "butter", "baking soda", "baking powder",  
              "salt");
      Assert.assertEquals(2, c2.getLayers(), 0.001);
   }
   /** Tests setLayers method. **/
   @Test public void setLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
              "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
              "butter", "baking soda", "baking powder", "salt"); 
      c1.setLayers(1);
      Assert.assertEquals(1, c1.getLayers(), 0.001);
      Cake c2 = new Cake("2-Layer", "Red Velvet", 1, 2, 
              "flour", "sugar", "cocoa powder", "food coloring",  
              "eggs", "butter", "baking soda", "baking powder",  
              "salt");
      c2.setLayers(2);
      Assert.assertEquals(2, c2.getLayers(), 0.001);
   }

 /** Tests price of cake. **/
   @Test public void priceTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
              "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
              "butter", "baking soda", "baking powder", "salt"); 
      Assert.assertEquals(8.00, c1.price(), 0.001);
      Cake c2 = new Cake("2-Layer", "Red Velvet", 1, 2, 
              "flour", "sugar", "cocoa powder", "food coloring",  
              "eggs", "butter", "baking soda", "baking powder",  
              "salt");
      Assert.assertEquals(16.00, c2.price(), 0.001);
   }
}
