import java.io.FileNotFoundException;
/**.
* This program is the main method for BakedItemList.  
*
* Project 10
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/8/2022
*/
public class BakeryPart2 {

/**
* This method is the main method for BakedItemList.
* @param args Command Line baked_item_data.csv.
* @throws FileNotFoundException for reading a file.
*/
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length > 0) {
         String fileName = args[0];
         BakedItemList bList = new BakedItemList();
         bList.readItemFile(fileName);
         
         System.out.println(bList.generateReport());
         System.out.println(bList.generateReportByClass());
         System.out.println(bList.generateReportByPrice());
         System.out.println(bList.generateReportByFlavor());
         System.out.println(bList.generateExcludedRecordsReport());
      }
      else
      {
         System.out.println("File name expected=as "
            + "command line argument.\nProgram ending");
      }
        
   }
}