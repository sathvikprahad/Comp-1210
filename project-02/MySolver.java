import java.util.Scanner;
/** 
*This program displays a number solver with variables x, y, and z.
*
*Project 2
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 08/31/2022
*/
public class MySolver {
/**.
*Prints number solver with three variables
* @param args Command line arguments - not used. 
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      double numberX = 0;
      double numberY = 0;
      double numberZ = 0;
      double numberAnswer = 0;
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
      
      // Prompt the user for x value:
      System.out.print("\tEnter x: ");
      numberX = userInput.nextDouble();
      
      // Prompt the user for y value: 
      System.out.print("\tEnter y: ");
      numberY = userInput.nextDouble();
      
      // Prompt the user for z value:
      System.out.print("\tEnter z: ");
      numberZ = userInput.nextDouble();
      
      numberAnswer = (8.5 * numberX + 6.1) * (10 * numberY + 7.9) / numberZ;
      if (numberZ == 0) {
         System.out.println("result is undefined");
      }
      else {
         System.out.print("result = " + numberAnswer);
      }
   }
}