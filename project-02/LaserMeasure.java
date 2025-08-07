import java.util.Scanner;
/** 
*This program displays various raw distance measurements.
*
*Project 2
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 08/31/2022
*/
public class LaserMeasure {
/**.
*Prints program that shows raw distance measurements
* @param args Command line arguments - not used. 
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      int distance = 0;
      System.out.print("Enter the raw distance measurement in inches: ");
      distance = userInput.nextInt();
      if (distance < 0) {
         System.out.println("Measurement must be non-negative!");
      }
      else {
         System.out.println("");
      }
      int inchesInYard = 36;
      int feetInYard = 3;
      int inchInFeet = 12;
      int inchesInMile = 63360;
      int miles = distance / inchesInMile;
      int remainingInches = distance % inchesInMile;
      int yards = remainingInches / inchesInYard;
      int remainingYards = remainingInches % inchesInYard;
      int feet = remainingYards / inchInFeet;
      int inches = remainingYards % inchInFeet;
      System.out.println("Measurement by combined miles," 
         + " yards, feet, inches: ");
      System.out.println("\tmiles: " + miles);
      System.out.println("\tyards: " + yards);
      System.out.println("\tfeet: " + feet);
      System.out.println("\tinches: " + inches);
      System.out.println("\n" + distance + " in = " + miles
         + " mi, " + yards + " yd, " + feet + " ft, " + inches + " in");
   }
}

