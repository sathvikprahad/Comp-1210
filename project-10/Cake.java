/**.
* The Cake class extends the BakedItem object.  
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public class Cake extends BakedItem { 
   protected int layers;
/**. 
*declares static final double BASE_RATE as constant.
*
*/
   public static final double BASE_RATE = 8;
/**. 
* Constructor for the class
*
* @param nameIn the baked item name
* @param flavorIn the flavor of the baked item
* @param quantityIn the quantity of baked goods
* @param ingredientsIn the ingredients for baked goods
* @param layersIn the amount of layers on the cake
*/
   public Cake(String nameIn, String flavorIn, int quantityIn,
      int layersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
   }
/**
* Gets the amount of layers on the cake.
*
* @return layers returns the amount of layers on the cake
*/
   public int getLayers() {
      return layers;
   }
/**
* Sets the amount of layers on the cake.
*
* @param layersIn sets the amount of layers on the cake
*/
   public void setLayers(int layersIn) {
      layers = layersIn;
   }
/**
* Abstract price for cakes. 
*
* @return price for cakes
*/
   public double price() {
      return (BASE_RATE * layers) * quantity; 
   }
}
