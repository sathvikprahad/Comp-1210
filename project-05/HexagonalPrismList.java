import java.util.ArrayList;
import java.text.DecimalFormat;
/**
*This program stores the name of the list and an Array list of 
   + hexagonal prism objects and includes methods that return 
   + different calculations and information.
*
*Project 5
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
*@param listIn - used
*@param nameIn - used
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
      String totalOutput = "";
      int index = 0;
      totalOutput += "-----" + getName() + "-----\n\n";
      while (index < list.size()) {
         totalOutput += (list.get(index) + "\n\n");
         index++;
      }
      return totalOutput;
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
}