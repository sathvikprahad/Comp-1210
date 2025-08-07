import java.text.DecimalFormat;
import java.util.ArrayList;
/**
*This program stores the name of the list and an Array list of 
   + hexagonal prism objects and includes methods that return 
   + different calculations and information.
*
*Project 5
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/23/2022
*/
public class HexagonalPyramidList {
// Fields for HexagonalPyramidList
   private String list = "";
   private ArrayList <HexagonalPyramid> hexList
      = new ArrayList <HexagonalPyramid>();
/**
*Constructor for HexagonalPyramidList.
*
*@param listIn - used
*@param hexListIn - used
*/
   public HexagonalPyramidList(String listIn,
      ArrayList<HexagonalPyramid> hexListIn)  {
      list = listIn;
      hexList = hexListIn;
   }
/**
*returns name of a given list.
*
*@return String name of the list
*/
   public string getName() {
      return list;
   }
/**
*returns number of hexagonal pyramids in a given list.
*
*@return int number of pyramids
*/
   public int numberOfHexagonalPrisms() {
      return hexList.size();
   }
/**
*returns total surface area of all hexagonal prism objects in list.
*
*@return double total surface area
*/
   public double totalSurfaceArea() {
      int index = 0;
      double listSurfaceArea = 0;
      while (index < hexList.size()) {
         listSurfaceArea += hexList.get(index).surfaceArea();
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
      while (index < hexList.size()) {
         listVolume += hexList.get(index).volume();
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
      if (numberOfHexagonalPrisms() == 0) {
         return 0;
      }
      else {
         return totalSurfaceArea() / numberOfHexagonalPrisms();
      }
   }
/**
*returns average volume of all hexagonal prism objects in list.
*
*@return double average volume
*/
   public double averageVolume() {
      if (numberOfHexagonalPrisms() == 0) {
         return 0;
      }
      else {
         return totalVolume() / numberOfHexagonalPrisms();
      }
   }
/**
*creates and returns the string of all hexagonal prism objects in list.
*
*@return String of a string created for object in array list
*/
   public String toString() {
      String totalOutput = "";
      int index = 0;
      while (index < hexList.size()) {
         totalOutput += hexList.get(index).toString();
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
      output += "----- Summary for " + getName() + "-----";
      output += "\nNumber of HexagonalPrisms: " + (numberOfHexagonalPrisms());
      output += "\nTotal Surface Area: " 
         + df.format(totalSurfaceArea());
      output += "\nTotal Volume: " + df.format(totalVolume());
      output += "\nAverage Surface Area: "
         + df.format(averageSurfaceArea());
      output += "\nAverage Volume: " + df.format(averageVolume());
      return output; 
   }
}