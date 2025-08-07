import java.util.Scanner;
  /** 
*This program stores the label, edge, and height of a hexagonal prism 
   + in order to calculate the surface area, lateral surface area, 
   + base area, and volume.
*
*Project 4
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/15/2022
*/
public class HexagonalPrismApp {
 /**.
*Creates prompts for user inputs of variables
*@param args Command line arguments - not used
*/
   public static void main(String[] args) {
      Scanner user = new Scanner(System.in);
      HexagonalPrism prism = new HexagonalPrism("initial", 0, 0);
   // First prompt
      System.out.println("Enter label, edge, and height for a" 
         + " hexagonal prism.");
   // Label prompt
      System.out.print("\tlabel: ");
   // Label variable 
      String label = user.nextLine();
      prism.setLabel(label);
   // Edge prompt
      System.out.print("\tedge: ");
   // Edge variable
      Double edge = Double.parseDouble(user.nextLine());
      prism.setEdge(edge);
   // Make sure edge is valid value
      if (!prism.setEdge(edge)) {
         System.out.println("Error: edge must be greater than zero.");
         return;
      }
   // Height prompt
      System.out.print("\theight: ");
   // Height variable 
      Double height = Double.parseDouble(user.nextLine());
      prism.setHeight(height);
   // Make sure height is valid value
      if (!prism.setHeight(height)) {
         System.out.println("Error: height must be greater than zero.");
         return;
      }
   // Print info
      System.out.println("\n" + prism);
   }
}

