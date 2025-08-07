import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
* Tests the BakedItems and Cookie Class.
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/

public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** Tests price method of cookie. **/
   @Test public void priceTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      Assert.assertEquals(4.20, c.price(), 0.001);
   }
   /** Tests the getName of cookie. **/   
   @Test public void getNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      Assert.assertEquals("Chips Delight", c.getName());
   }
   /** Tests the setName of cookie. **/   
   @Test public void setNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      c.setName("Chips Delight");
      Assert.assertEquals("Chips Delight", c.getName());
   }
   /** Tests the getFlavor of cookie. **/
   @Test public void getFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      Assert.assertEquals("Chocolate Chip", c.getFlavor());
   }
   /** Tests the setFlavor of cookie. **/
   @Test public void setFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      c.setFlavor("Chocolate Chip");
      Assert.assertEquals("Chocolate Chip", c.getFlavor());
   }
/** Tests the getQuantity of cookie. **/
   @Test public void getQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      Assert.assertEquals(12, c.getQuantity());
   }
/** Tests the setQuantity of cookie. **/
   @Test public void setQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      c.setQuantity(12);
      Assert.assertEquals(12, c.getQuantity());
   }

/** Tests the getIngredients of cookie. **/
   @Test public void getIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
         
      String[] test = {"flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt"};
         
      Assert.assertArrayEquals(test, c.getIngredients());
   }
   /** Tests the setIngredients of cookie. **/
   @Test public void setIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
         
      String[] test = {"flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt"};
      c.setIngredients(test);
      Assert.assertArrayEquals(test, c.getIngredients());
   }

   /** Tests the getCount() method of bakedItems. **/
   @Test public void getCountTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      c.resetCount();
      Assert.assertEquals(0, c.getCount(), 0.001);
   }

/** Tests the toString() method of bakedItems. **/
   @Test public void toStringTester() {
      String test = "";
      test += "Cookie: Chips Delight" + " - " + "Chocolate Chip" 
         + "   Quantity: 12"
         + "   Price: $4.20"
         + "\n" + "(Ingredients: flour, sugar, dark chocolate chips,"
         + " butter, baking soda, \nsalt"
         + ")";
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12, 
         "flour", "sugar", "dark chocolate chips", 
         "butter", "baking soda", "salt");
      Assert.assertEquals(test, c.toString());
   }
}

