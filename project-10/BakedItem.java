import java.text.DecimalFormat;
/**.
* The BakedItem class constructs the BakedItem object.  
*
* Project 9
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public abstract class BakedItem implements Comparable<BakedItem> {
   protected String name; 
   protected String flavor;
   protected int quantity;
   protected String[] ingredients; 
   protected static int count = 0; 
/**. 
* Constructor for the class
*
* @param nameIn the baked item name
* @param flavorIn the flavor of the baked item
* @param quantityIn the quantity of baked goods
* @param ingredientsIn the ingredients for baked goods
*/
   public BakedItem(String nameIn, String flavorIn, int quantityIn,
      String...ingredientsIn) {
      name = nameIn;
      flavor = flavorIn; 
      quantity = quantityIn;
      ingredients = ingredientsIn;
      count++; 
   }
/**.
* Gets the name of the baked good
*
* @return name returns the name of the baked good
*/
   public String getName() {
      return name;
   }
/**.
* Sets the name of the baked good
*
* @param nameIn sets the name of the baked good
*/
   public void setName(String nameIn) {
      name = nameIn;
   }
/**.
* Gets the flavor of the baked good
*
* @return flavor returns the flavor of the baked good
*/
   public String getFlavor() {
      return flavor;
   }
/**.
* Sets the flavor of the baked good
*
* @param flavorIn sets the flavor of the baked good
*/
   public void setFlavor(String flavorIn) {
      flavor = flavorIn;
   }

/**.
* Gets the quantity of the baked goods
*
* @return quantity returns the quantity of the baked goods
*/
   public int getQuantity() {
      return quantity;
   }
/**.
* Sets the quantity of the baked goods
*
* @param quantityIn sets the quantity of the baked good
*/
   public void setQuantity(int quantityIn) {
      quantity = quantityIn;
   }
/**.
* Gets the ingredients of the baked good
*
* @return ingredientsIn returns the flavor of the baked good
*/
   public String[] getIngredients() {
      return ingredients;
   }
/**.
* Sets the ingredients of the baked good
*
* @param ingredientsIn sets the flavor of the baked good
*/
   public void setIngredients(String...ingredientsIn) {
      ingredients = ingredientsIn;
   }
/**.
* Gets the count of the baked goods
*
* @return count returns the count of the baked goods
*/
   public static int getCount() {
      return count;
   }
/**.
* Resets the count of the baked goods
*
*/
   public static void resetCount() {
      count = 0;
   }
/**.
* Returns the information in a formatted way.
*
* @return output returns the output in a formatted way
*/
   public final String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      String ingredientsList = "";
      int i = 0;
      for (String item : ingredients) {
         if (i == 0) {
            ingredientsList += item;
         }
         else if (i % 5 != 0) {
            ingredientsList += ", " + item;
         }
         else {
            ingredientsList += ", \n" + item;
         }
         i++;
      }
      String output = this.getClass().toString().substring(6)
         + ": " + name + " - " + flavor  
         + "   Quantity: " + quantity
         + "   Price: " + df.format(price())
         + "\n" + "(Ingredients: " + ingredientsList
         + ")";
      return output;
   }
/**.
* Compares two items in this class
*
* @return returns the value of compareTo 
* @param bakedItemIn second object to compare object one to
*/
   public int compareTo(BakedItem bakedItemIn) {
      return this.toString().toLowerCase()
         .compareTo(bakedItemIn.toString().toLowerCase());
   }
/**
* Abstract price for baked good. 
*
* @return price for a baked good
*/
   public abstract double price();
}

