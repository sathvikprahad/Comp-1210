/**.
* The WeddingCake class extends the Cake object.  
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public class WeddingCake extends Cake {
   private int tiers;
/**. 
*declares static final double BASE_RATE as constant.
*
*/
   public static final double BASE_RATE = 15.0;
/**. 
* Constructor for the class
*
* @param nameIn the baked item name
* @param flavorIn the flavor of the baked item
* @param quantityIn the quantity of baked goods
* @param ingredientsIn the ingredients for baked goods
* @param layersIn the amount of layers on the cake
* @param tiersIn the tier of the wedding cake
*/
   public WeddingCake(String nameIn, String flavorIn, int quantityIn,
      int layersIn, int tiersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;
   }
/**
* Gets the amount of tiers. 
*
* @return tiers returns the amount of tiers
*/
   public int getTiers() {
      return tiers;
   }
/**
* Sets the amount of tiers.
*
* @param tiersIn sets the amount of tiers
*/
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
   }
/**
* Abstract price for wedding cakes. 
*
* @return price for wedding cakes
*/
   public double price() {
      return (BASE_RATE * layers * tiers) * quantity; 
   }
}

