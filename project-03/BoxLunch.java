import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/** 
*This program accepts user input and outputs the theme, the number of adult 
    + meals, price of adult meal, number of child meals, price of child  
    + meal, and name of the customer which is encoded through user input value. 
*
*Project 3
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/07/2022
*/
public class BoxLunch {
/**.
*Prints program that shows various pieces of information about 
     + customer and their lunch  
* @param args Command line arguments - not used. 
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int theme = 0;
      int numAdultMeal = 0;
      double priceAdultMeal = 0;
      int numChildMeal = 0;
      double priceChildMeal = 0;
      double orderCode = 0;
      double total = 0;
      String orderStr = "";
      orderStr = Double.toString(orderCode);
      String name = "";
      Random generator = new Random();
      int randomNum1;
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      
   // Prompt the user for order code:
      System.out.print("Enter order code: ");
      orderStr = userInput.nextLine();
      orderStr = orderStr.trim();
   
      
      if (orderStr.length() < 13) 
      {
         System.out.println("");
         System.out.println("*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters."); 
      }
      
      else 
      {
         System.out.println("");
         // print name of customer 
         name = orderStr.substring(13, orderStr.length());
         System.out.println("Name: " + name);
         // print price and number of adult meals
         numAdultMeal = Integer.parseInt(orderStr.substring(1, 3));
         priceAdultMeal = Double.parseDouble(orderStr.substring(3, 7)) / 100;
         System.out.println("Adult meals: " + numAdultMeal + " at " 
            + df.format(priceAdultMeal));
         // print price and number of child meals
         numChildMeal = Integer.parseInt(orderStr.substring(7, 9));
         priceChildMeal = Double.parseDouble(orderStr.substring(9, 13)) / 100;
         System.out.println("Child meals: " + numChildMeal + " at "
            + df.format(priceChildMeal));
         // print total of adult meals and child meals 
         total = (numAdultMeal * priceAdultMeal) 
            + (numChildMeal * priceChildMeal);
         System.out.println("Total: " + df.format(total));
      }
      if (orderStr.charAt(0) == '0')
      {
         System.out.println("Theme: Birthday");
      }
      else if (orderStr.charAt(0) == '1')
      {
         System.out.println("Theme: Graduation");
      }
      else {
         System.out.println("Theme: Holiday");
      }
      randomNum1 = generator.nextInt(10000) + 1;
      System.out.println("Lucky Number: " + randomNum1);
   }
}
   
