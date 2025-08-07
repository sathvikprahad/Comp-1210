import java.util.Comparator;
/**.
* This program sets the compare method for baked items based on their price.  
*
* Project 10
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public class FlavorComparator implements Comparator<BakedItem> {

/**
* This method sets the compare method for baked item based on their flavor.
* @param b1 is the first item entered.
* @param b2 is the second item entered.
* @return the value of the compare result.
*/
   public int compare(BakedItem b1, BakedItem b2) {
      return b1.flavor.toLowerCase().compareTo(b2.flavor.toLowerCase());
   }
}