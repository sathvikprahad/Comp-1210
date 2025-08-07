import java.text.DecimalFormat;
/**.
* The RingTorusList that builds off of RingTorus. 
*
* Project 8
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 10/27/2022
*/
public class RingTorusList {
   private String name;
   private RingTorus[] list;
   private int num;
   
   /**
   * The constructor for the RingTorusList.
   *
   * @param nameIn the name of the RingTorusList
   * @param listIn the list of RingTorus
   * @param numIn the length of the list
   */
   public RingTorusList(String nameIn,
      RingTorus[] listIn, int numIn) {
      name = nameIn;
      list = listIn;
      num = numIn;
   }
   
   /**
   * Gets the name of the RingTorusList objects.
   *
   * @return name returns the name of the object
   */
   public String getName() {
      return name;
   }
   
   /**
   * Counts and returns the number of RingToruses in the list.
   *
   * @return count returns the number of RingToruses in the list
   */
   public int numberOfRingToruses() {
      int count = 0;
      for (RingTorus item : list) {
         if (item != null) {
            count++;
         }
      }
      return count;
   }
   /**
   * Returns the total diameter of the objects in the list.
   *
   * @return total returns the total diameter
   */
   public double totalDiameter() {
      double total = 0;
      if (num > 0) {
         for (RingTorus item : list) {
            if (item != null) {
               total = total + item.diameter();
            }
         }
      }
      return total;
   }
   
   /**
   * Returns the total surface area of the objects in the list.
   *
   * @return total returns the total surface area
   */
   public double totalSurfaceArea() {
      double total = 0;
      if (num > 0) {
         for (RingTorus item : list) {
            if (item != null) {
               total = total + item.surfaceArea();
            }
         }
      }
      return total;
   }
   
   /**
   * Returns the total sum of the volume.
   *
   * @return total returns the total volume of the list
   */
   public double totalVolume() {
      double total = 0;
      if (num > 0) {
         for (RingTorus item : list) {
            if (item != null) {
               total = total + item.volume();
            }
         }
      }
      return total;
   }
   /**
   * Returns the average diameter of the list.
   *
   * @return returns the average diameter
   */
   public double averageDiameter() {
      if (num > 0) {
         double a = totalDiameter();
         return (a / numberOfRingToruses());
      }
      else {
         return 0;
      }
   }
   
   /**
   * Returns the average surface area of the list.
   *
   * @return returns the average surface area
   */
   public double averageSurfaceArea() {
      if (num > 0) {
         double a = totalSurfaceArea();
         return (a / numberOfRingToruses());
      }
      else {
         return 0;
      }
   }
   
   /**
   * Returns the average volume of the list.
   *
   * @return returns the average volume of the list
   */
   public double averageVolume() {
      if (num > 0) {
         double a = totalVolume();
         return (a / numberOfRingToruses());
      }
      else {
         return 0;
      }
   }
   
   /**
   * Returns the information in a formatted way.
   *
   * @return output returns the information in a formatted way
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----\n" 
         + "Number of RingToruses: " + numberOfRingToruses()
         + "\nTotal Diameter: " + df.format(totalDiameter()) + " units"
         + "\nTotal Surface Area: " + df.format(totalSurfaceArea()) 
         + " square units"
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units"
         + "\nAverage Diameter: " + df.format(averageDiameter()) + " units"
         + "\nAverage Surface Area: " + df.format(averageSurfaceArea()) 
         + " square units"
         + "\nAverage Volume: " + df.format(averageVolume()) + " cubic units";
      return output;
   }
   
   /**
   * Returns the list of the RingTorus.
   *
   * @return list returns the list of the RingTorus
   */
   public RingTorus[] getList() {
      return list;
   }
   
   /**
   * Adds a ring torus to the list.
   *
   * @param label the label for the RingTorus
   * @param largeRadius the large radius value of the RingTorus
   * @param smallRadius the small radius value of the RingTorus
   */
   public void addRingTorus(String label, 
      double largeRadius, double smallRadius) {
      RingTorus add = new RingTorus(label, largeRadius, smallRadius);
      list[num] = add;
      num++;
   }
   
   /**
   * Finds the ring torus that is in input found.
   *
   * @param newLabel the label that is used to found
   * @return thing returns RingTorus object that is found
   */
   public RingTorus findRingTorus(String newLabel) {
      boolean a = true;
      RingTorus thing = null;
      for (RingTorus obj : list) {
         if (obj != null) {
            if (obj.getLabel().equalsIgnoreCase(newLabel)) {
               a = false;
               thing = obj;
            }
         }
      }
      return thing;
   }
   
   /**
   * Deletes the RingTorus object that has the specified label.
   *
   * @param labelIn the label that is found
   * @return thing returns the RingTorus object that is deleted
   */
   public RingTorus deleteRingTorus(String labelIn) {
      RingTorus thing = null;
      
      for (int i = 0; i < num; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            thing = list[i];
            
            for (int p = i; p < num - 1; p++) {
               list[i] = list[i + 1];
            }
            list[num - 1] = null;
            num--;
         }
      }
      return thing;
   }
   
   /**
   * Edits the RingTorus with the specified values.
   *
   * @param label the label that will be edited
   * @param largeRadius the large radius value that will be changed
   * @param smallRadius the small radius value that will be changed
   * @return a returns if the RingTorus object is edited
   */
   public boolean editRingTorus(String label, double largeRadius,
      double smallRadius) {
      boolean a = false;
      for (RingTorus obj : list) {
         if (obj != null) {
            if (obj.getLabel().equalsIgnoreCase(label)) {
               obj.setLargeRadius(largeRadius);
               obj.setSmallRadius(smallRadius);
               a = true;
            }
         }
      }
      return a;
   }
   
   /**
   * Returns the RingTorus object with the largest volume in the list.
   *
   * @return largeVolume returns the RingTorus with largest volume
   */
   public RingTorus findRingTorusWithLargestVolume() {
      double volume = -9999;
      RingTorus largeVolume = null;
      for (RingTorus obj : list) {
         if (obj != null) {
            if (obj.volume() > volume) {
               largeVolume = obj;
               volume = obj.volume();
            }
         }
      }
      return largeVolume;
   }
}