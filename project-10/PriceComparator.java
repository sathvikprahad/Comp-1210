import java.util.Comparator;
/**.
* This program sets the compare method for baked items based on their price.  
*
* Project 10
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/3/2022
*/
public class PriceComparator implements Comparator<BakedItem> {

/**
* This method sets the compare method for baked item based on their price.
* @param b1 is the first item entered.
* @param b2 is the second item entered.
* @return the value of the compare result.
*/
   public int compare(BakedItem b1, BakedItem b2) {
      if (b1.price() < b2.price()) {
         return -1;
      }
      else if (b1.price() > b2.price()) {
         return 1;
      }
      return 0;
   }
      
}