import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
/**
*This program stores the name of the list and an Array list of 
*hexagonal prism objects and includes methods that return 
*different calculations and information.
*
*Project 6
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/23/2022
*/
public class HexagonalPrismList {
// Fields for HexagonalPrismList
   private String name;
   private ArrayList<HexagonalPrism> list = new ArrayList<HexagonalPrism>();
   
/**
*Constructor for HexagonalPrismList.
*
*@param listIn The array list
*@param nameIn The name of the list
*/
   public HexagonalPrismList(String nameIn, ArrayList<HexagonalPrism> listIn)  {
      name = nameIn;
      list = listIn;
   }
/**
*returns name of a given list.
*
*@return String name of the list
*/
   public String getName() {
      return name;
   }
/**
*returns number of hexagonal prisms in a given list.
*
*@return int number of pyramids
*/
   public int numberOfHexagonalPrisms() {
      return list.size();
   }
/**
*returns total surface area of all hexagonal prism objects in list.
*
*@return double total surface area
*/
   public double totalSurfaceArea() {
      int index = 0;
      double listSurfaceArea = 0;
      while (index < list.size()) {
         listSurfaceArea += list.get(index).surfaceArea();
         index++;
      }
      return listSurfaceArea;
   }
  /**
  *returns total volume of all hexagonal prism objects in list.
  *
  *@return double total volume
  */
   public double totalVolume() {
      int index = 0;
      double listVolume = 0;
      while (index < list.size()) {
         listVolume += list.get(index).volume();
         index++;
      }
      return listVolume;
   }
/**
*returns average surface area of all hexagonal prism objects in list.
*
*@return double average surface area 
*/
   public double averageSurfaceArea() {
      double listAverageSurfaceArea = 0.0;
      if (list.size() != 0) {
         listAverageSurfaceArea = totalSurfaceArea()
            / list.size();
      }
      return listAverageSurfaceArea;
   }
/**
*returns average volume of all hexagonal prism objects in list.
*
*@return double average volume
*/
   public double averageVolume() {
      double listAverageVolume = 0.0;
      if (list.size() != 0) {
         listAverageVolume = totalVolume()
            / list.size();
      }
      return listAverageVolume;
   }
/**
*creates and returns the string of all hexagonal prism objects in list.
*
*@return String of a string created for object in array list
*/
   public String toString() {
      String output = "";
      int index = 0;
      output = getName();
      if (list.size() > 0) {
         output += "\n";
         while (index < list.size()) {
            output += "\n";
            output += (list.get(index));
            if (index + 1 < list.size()) {
               output += "\n";
            }
            index++;
         }
      }
      return output;
   }
  /**
*creates and returns the summary info of all hexagonal prism objects in list.
*
*@return String for summary info in list
*/
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "";
      output += "\n----- Summary for " + (getName()) + " -----" + "\n";
      output += "Number of HexagonalPrisms: " 
         + numberOfHexagonalPrisms() + "\n";
      output += "Total Surface Area: " 
         + df.format(totalSurfaceArea()) + " square units\n";
      output += "Total Volume: " 
         + df.format(totalVolume()) + " cubic units\n";
      output += "Average Surface Area: " 
         + df.format(averageSurfaceArea()) + " square units\n";
      output += "Average Volume: " 
         + df.format(averageVolume()) + " cubic units\n\n";
      return output; 
   }
/**
*Returns back array list of hexagonal prism objects.
*@return list returns array lists of hexagonal prisms
*/ 
   public ArrayList<HexagonalPrism> getList() {
      return list; 
   }

/**
*Reads the file that is imported.
*@param file the file that is read
*@return listb returns a hexagonal prism list object and reads file
*@throws FileNotFoundException file cannot be found
   */
   public HexagonalPrismList readFile(String file)
      throws FileNotFoundException {
      String listName = "";
      String label = "";
      double edge = 0;
      double height = 0;
      Scanner scan = new Scanner(new File(file));
      ArrayList<HexagonalPrism> listTwo = new ArrayList<HexagonalPrism>();
      
      
      listName = scan.nextLine();
      while (scan.hasNext()) {
         label = scan.nextLine();
         edge = Double.parseDouble(scan.nextLine());
         height = Double.parseDouble(scan.nextLine());
         
         HexagonalPrism object = new HexagonalPrism(label, edge, height); 
         listTwo.add(object);
      }
      HexagonalPrismList listb = new HexagonalPrismList(listName, listTwo);
      return listb;
   
   }
   /**
   * Adds a hexagonal prims object to the hexagonal prism list.
   * @param label the name of the object
   * @param edge the edge length
   * @param height the height length
   */
   public void addHexagonalPrism(String label, double edge, double height) {
      HexagonalPrism object = new HexagonalPrism(label, edge, height);
      list.add(object);
   }
   
   /**
   * Finds a hexagonal prism with the certain name specified in the param.
   * @param label the name that the method looks for
   * @return object returns the object with the certain name
   */
   public HexagonalPrism findHexagonalPrism(String label) {
      for (HexagonalPrism object : list) {
         if (object.getLabel().equalsIgnoreCase(label)) {
            return object;
         }
      }
      return null;
   }
   
   /**
   * Deletes certain hexagonal prism objects from the list. 
   * @param label the name of the object that deletes
   * @return returns the name of the object that deletes
   */
   public HexagonalPrism deleteHexagonalPrism(String label) {
      int i = list.indexOf(findHexagonalPrism(label));
      if (i >= 0) {
         return list.remove(i);
      }
      else {
         return null;
      }
   }
   /**
   * edits the hexagonal prism object with inputted values.
   * @param label the name of the object
   * @param edge the edge length
   * @param height the height length
   * @return worked returns the boolean value if the edit was successful
   */
   public boolean editHexagonalPrism(String label, double edge, double height) {
      boolean worked = false;
      for (HexagonalPrism object : list) {
         if (object.getLabel().equalsIgnoreCase(label)) {
            worked = true;
            object.setEdge(edge);
            object.setHeight(height);
            break;
         }
      
      }
      return worked;
   }
   
}