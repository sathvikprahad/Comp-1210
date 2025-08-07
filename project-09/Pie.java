/**.
* The Pie class extends the BakedItem object.  
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public class Pie extends BakedItem {
   private double crustCost; 
/**. 
*declares static final double BASE_RATE as constant.
*
*/
   public static final double BASE_RATE = 12.0;
/**. 
* Constructor for the class
*
* @param nameIn the baked item name
* @param flavorIn the flavor of the baked item
* @param quantityIn the quantity of baked goods
* @param ingredientsIn the ingredients for baked goods
* @param crustCostIn the cost of the pie crust
*/
   public Pie(String nameIn, String flavorIn, int quantityIn,
      double crustCostIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }

/**
* Gets the cost of the pie crust.
*
* @return crustCost returns the cost of the pie crust
*/
   public double getCrustCost() {
      return crustCost;
   }
/**.
* Sets the cost of the pie crust
*
* @param crustCostIn sets the price of the baked good
*/
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
   }
/**
* Abstract price for pies. 
*
* @return price for pies
*/
   public double price() {
      return (BASE_RATE + crustCost) * quantity; 
   }
}
