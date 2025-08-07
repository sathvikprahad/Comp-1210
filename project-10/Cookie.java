/**.
* The Cookie class extends the BakedItem object.  
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public class Cookie extends BakedItem {
/**. 
*declares static BASE_RATE as constant.
*
*/ 
   public static final double BASE_RATE = 0.35;
/**. 
* Constructor for the class
*
* @param nameIn the baked item name
* @param flavorIn the flavor of the baked item
* @param quantityIn the quantity of baked goods
* @param ingredientsIn the ingredients for baked goods
*/
   public Cookie(String nameIn, String flavorIn, int quantityIn,
      String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }
/**
* Abstract price for cookies. 
*
* @return price for a cookies
*/
   public double price() {
      return (BASE_RATE * quantity); 
   }
}

