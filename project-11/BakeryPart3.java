import java.io.FileNotFoundException;
/**
* The main method for the program.
*
* Project 11
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/17/2022
*/

public class BakeryPart3 {
   /**
   * Main driver class for the project.
   @param args Command Line
   */
   public static void main(String[] args) //throws FileNotFoundException
   {
      //Check to see if a file was provided
      if (args.length > 0)
      {
         String file = args[0];
         try
         {
            
            BakedItemList bList = new BakedItemList();
            bList.readItemFile(file); 
            
            System.out.println(bList.generateReport());
            System.out.println(bList.generateReportByClass());
            System.out.println(bList.generateReportByPrice());
            System.out.println(bList.generateReportByFlavor());
            System.out.println(bList.generateExcludedRecordsReport());
         }
         catch (FileNotFoundException exception)
         {
            System.out.println("Attempted to read file: "
               + "fake_data.csv (No such file or directory)"); 
            System.out.println("Program ending.");
         }   
      }
      else
      {
         System.out.println("File name expected as command line argument."
            + "\nProgram ending.");
      }
   }
}
