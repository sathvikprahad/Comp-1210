import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
/**
*This driver class allows for a menu to be output and depending 
*on the user input, a certain function is done.
*
*Project 6
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/23/2022
*/
public class HexagonalPrismListMenuApp {
   /**
   *Allows for a menu to be output and a function to be done alongside it.
   *
   *@param args Command line arguements - not used
   *@throws FileNotFoundException when the file is not found
   */
   public static void main(String[] args) throws FileNotFoundException {
      String nameOfList = "*** no list name assigned ***";
      ArrayList<HexagonalPrism> object = new ArrayList<HexagonalPrism>();
      HexagonalPrismList list = new HexagonalPrismList(nameOfList, object);
      String file = "";
      String input = "";
      String label = "";
      double edge = 0.0;
      double height = 0.0;
      int i = 0;
      
      Scanner scan = new Scanner(System.in); 
      System.out.println("HexagonalPrism List System Menu\n"
         + "R - Read File and Create HexagonalPrism List\n"
         + "P - Print HexagonalPrism List\n"
         + "S - Print Summary\n"
         + "A - Add HexagonalPrism\n"
         + "D - Delete HexagonalPrism\n"
         + "F - Find HexagonalPrism\n"
         + "E - Edit HexagonalPrism\n"
         + "Q - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         input = scan.nextLine();
         
         if (input.length() == 0) {
            continue;
         }
         
         input = input.toUpperCase();
         char character = input.charAt(0);
         
         switch(character) {
            case 'R':
               System.out.print("\tFile name: ");
               file = scan.nextLine();
               
               list = list.readFile(file);
               System.out.println("\tFile read in and "
                  + "HexagonalPrism List created \n");
               break;
               
            case 'P':
               System.out.println();
               String formattedList = list.toString().replace(", A", "A");
               formattedList = formattedList.replace("[", "");
               System.out.print(formattedList.replace("]", ""));
               break;
               
            case 'S':
               System.out.println("\n" + list.summaryInfo() + "\n");
               break;
            
            case 'A': 
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               list.addHexagonalPrism(label, edge, height);
               System.out.println("\t*** HexagonalPrism added ***\n");
               break;
                  
            case 'D': 
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               
               if (list.deleteHexagonalPrism(label) != null) {
                  list.deleteHexagonalPrism(label);
                  System.out.println("\t\"" + label.substring(0, 1)
                     .toUpperCase() + label.substring(1).toLowerCase()
                     + "\" deleted\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found \n");
               }
               break;
                  
            case 'F':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
            
               if (list.findHexagonalPrism(label) != null) {
                  System.out.println(list.
                     findHexagonalPrism(label).toString() + "\n");
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
               
            case 'E':
               System.out.print("\tLabel: ");
               label = scan.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(scan.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(scan.nextLine());
               
               if (list.findHexagonalPrism(label) != null) {
                  list.editHexagonalPrism(label, edge, height);
                  System.out.println("\t\""
                     + label + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
                     
               }
               break;
                  
            case 'Q':
               break;
               
            default:
               System.out.println("\t*** invalid code ***\n");
         }
             
      
      } while (!input.equalsIgnoreCase("Q"));
   }
}