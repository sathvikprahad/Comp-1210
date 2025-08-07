import java.text.DecimalFormat;
/**.
* This class makes the ring torus type
*
* Project 7A
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 10/13/2022
*/
public class RingTorus {

   private String label = "";
   private double largeRadius = 0;
   private double smallRadius = 0;
   private static int count = 0;
/**
   * The RingTorus constructor for the RingTorus class.
   *
   * @param labelIn the label string value
   * @param largeRadiusIn the large radius value
   * @param smallRadiusIn the small radius value
   */
   public RingTorus(String labelIn, double largeRadiusIn,
      double smallRadiusIn) {
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      count++;
   }
/**
   * Gets the label. 
   * 
   * @return label returns the label
   */
   public String getLabel() {
      return label;
   }
   /**
   * Sets the label.
   * 
   * @param labelIn the string value for the label
   * 
   * @return isSet returns true or false depending on if lable was set
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
   * Outputs the large radius.
   * 
   * @return radius returns the large radius
   */
   public double getLargeRadius() {
      return largeRadius;
   }
   /**
   * Sets the large radius value.
   * 
   * @param largeRadiusIn the value for the large radius
   * 
   * @return isSet returns true or false depending on if large radius was set
   */
   public boolean setLargeRadius(double largeRadiusIn) {
      boolean isSet = false;
      if ((largeRadiusIn >= 0) && (largeRadiusIn > smallRadius)) {
         isSet = true;
         largeRadius = largeRadiusIn;
      }
      return isSet;
   }
/**
   * Outputs the small radius.
   * 
   * @return radii returns the small radius
   */
   public double getSmallRadius() {
      return smallRadius;
   }
   /**
   * Sets the small radius value.
   * 
   * @param smallRadiusIn the small radius value
   * 
   * @return isSet returns true or false depending on if small radius was set
   */
   public boolean setSmallRadius(double smallRadiusIn) {
      boolean isSet = false;
      if ((smallRadiusIn >= 0) && (smallRadiusIn < largeRadius)) {
         smallRadius = smallRadiusIn;
         isSet = true;
      }
      return isSet;
   }
/** 
* Returns the diameter of the shape.
*
* @return diameter returns the diameter of the shape
*/
   public double diameter() {
      double diameter = 2 * (getLargeRadius() + getSmallRadius());
      return diameter;
   }
/**
* Calculates the surface area of the figure.
*
* @return surfArea returns the surface area
*/
   public double surfaceArea() {
      double surfArea = ((2 * Math.PI * getLargeRadius()) 
         * (2 * Math.PI * getSmallRadius()));
      return surfArea;
   }
/** 
* Calculates the volume of the figure.
*
* @return vol returns the volume of the figure
*/
   public double volume() {
      double vol = ((2 * Math.PI * getLargeRadius())
         * (Math.PI * Math.pow(getSmallRadius(), 2)));
      return vol;
   }
/**
   * Outputs all of the information taken and calculated in a formatted way.
   * 
   * @return output a formatted output
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "RingTorus \"" + getLabel() + "\"\n"
         + "\tlarge radius = " + df.format(largeRadius) + " units\n"
         + "\tsmall radius = " + df.format(smallRadius) + " units\n" 
         + "\tdiameter = " + df.format(diameter()) + " units\n"
         + "\tsurface area = " + df.format(surfaceArea()) + " square units\n"
         + "\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
/**
   * Returns the number of objects.
   *
   * @return count returns the count of objects
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets the count of objects.
   */
   public static void resetCount() {
      count = 0;
   }
/**
   * Returns true or false depending on if the objects are same.
   *
   * @param obj the object being compared to
   *
   * @return returns if the 2 objects are the same
   */
   public boolean equals(Object obj) { 
      if (!(obj instanceof RingTorus)) { 
         return false; 
      } 
      else {  
         RingTorus rt = (RingTorus) obj;        
         return (label.equalsIgnoreCase(rt.getLabel()) 
            && (Math.abs(largeRadius - rt.getLargeRadius()) < .000001) 
            && (Math.abs(smallRadius - rt.getSmallRadius()) < .000001)); 
      }  
   } 
   /**
   * Hash code for JUnit.
   *
   * @return returns 0
   */
   public int hashCode() {
      return 0;
   }

}