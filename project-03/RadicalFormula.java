import java.util.Scanner;
import java.text.DecimalFormat;
/** 
*This program solves an expression with a user input x value.
*
*Project 3
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/07/2022
*/
public class RadicalFormula {
/**.
*Prints program that shows details of result of an expression 
* @param args Command line arguments - not used. 
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double numberX = 0; 
      double result = 0;
      String resultStr = "";
      int decimalLeft = 0;
      int decimalRight = 0; 
      int decimalIndex = 0; 
      int resultLength = 0;
   // Prompt the user for x value:
      System.out.print("Enter a value for x: ");
      numberX = userInput.nextDouble();
      
   // Calculates result
      result = Math.sqrt(Math.pow(3 * Math.pow(numberX, 8) - 2 
            * Math.pow(numberX, 3), 2)
            + Math.abs(3 * Math.pow(numberX, 5) - 2 * Math.pow(numberX, 3)));
   // Prints result 
      System.out.println("Result: " + result);
      
   // Converting result to string
      resultStr = Double.toString(result);
      resultLength = resultStr.length();
      decimalIndex = resultStr.indexOf(".");
      decimalLeft = decimalIndex;
      decimalRight = resultLength - decimalIndex - 1;
   
   // Prints digits from right and left of decimal
      System.out.println("# digits to left of decimal point: " + decimalLeft);
      System.out.println("# digits to right of decimal point: " + decimalRight);
   
   // Obtaining Formatted Result and Printing Result
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      double answer = result;
      System.out.println("Formatted Result: " + df.format(answer));
   
   }
}
   
