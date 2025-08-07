import java.text.DecimalFormat;
   /** 
*This program stores the label, edge, and height of a hexagonal prism 
   + in order to calculate the surface area, lateral surface area, 
   + base area, and volume.
*
*Project 4
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/15/2022
*/
public class HexagonalPrism {
/** 
*Displays program that shows various calculations of hexagonal prism. 
*@param args Command line arguments - not used. 
*/   
// instance variables
   private String label = "";
   private double edge = 0;
   private double height = 0;

// constructor
/**.
*Creates parameters for hexagonal prism.
*@param labelIn - used
*@param edgeIn - used
*@param heightIn - used
*/
   public HexagonalPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
/**.
*gets label of the object
*@return the String for the label of the prism
*/
   public String getLabel() {
      return label;
   }
/**.
 *sets label for the prism
 *@param labelIn - used
 *@return boolean when the label is set
 */
   public boolean setLabel(String labelIn) {
      boolean isLabelSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isLabelSet = true; 
      } 
      return isLabelSet;
   }
/**.
*gets base edge of the object
*@return the double for the edge of the prism
*/
   public double getEdge()  {
      return edge;
   }
/**.
 *sets the edge to the double value
 *@param edgeIn - used
 *@return boolean when the edge is set
 */
   public boolean setEdge(double edgeIn) {
      boolean isEdgeSet = false; 
      if (edgeIn > 0) {
         edge = edgeIn;
         isEdgeSet = true; 
      }
      return isEdgeSet;
   }
/**. 
*gets height of the object
*@return the double for the height of the prism
*/
   public double getHeight()  {
      return height;
   }
/**.
 *sets the height to the double value
 *@param heightIn - used
 *@return boolean when height is set
 */
   public boolean setHeight(double heightIn) {
      boolean isHeightSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isHeightSet = true;
      } 
      return isHeightSet;
   }
/**.
 *Calculates and returns surface area for the hexagonal prism
 *@return double with surface area calculation
 */
   public double surfaceArea()  {
      double surfaceArea = (6 * edge * height) 
         + (3 * (Math.sqrt(3)) * Math.pow(edge, 2));
      return surfaceArea;
   }
/**.
 *Calculates and returns lateral surface area for the hexagonal prism
 *@return double with lateral surface area calculation
 */
   public double lateralSurfaceArea()  {
      double lateralSurfaceArea = (6 * edge * height);
      return lateralSurfaceArea;
   }
/**.
 *Calculates and returns base area for the hexagonal prism
 *@return double with base area calculation
 */
   public double baseArea()  {
      double baseArea = ((3 * (Math.sqrt(3))) * (Math.pow(edge, 2) / 2));
      return baseArea; 
   }
/**.
 *Calculates and returns volume for the hexagonal prism
 *@return double with volume calculation
 */
   public double volume()  {
      double volume = (3 * Math.sqrt(3) / 2 * Math.pow(edge, 2) * height);
      return volume;
   }
/**. 
*Creates and shows the calculated values with strings 
*@return String created string
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "HexagonalPrism \"" + label + "\" ";
      output += "has 8 faces, 18 edges, and 12 vertices.";
      output += "\n\tedge = " + edge + " units";
      output += "\n\theight = " + height + " units";
      output += "\n\tlateral surface area = " + df.format(lateralSurfaceArea())
         + " square units";
      output += "\n\tbase area = " + df.format(baseArea()) + " square units";
      output += "\n\tsurface area = " + df.format(surfaceArea())
         + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}
