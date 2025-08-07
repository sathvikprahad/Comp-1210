import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
/**.
* The BakedItemList class reads in data and generates reports of the objects.  
*
* Project 10
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/8/2022
*/
public class BakedItemList {
   private String listName;
   private BakedItem[] itemList; 
   private int itemCount; 
   private String[] excludedRecords;
   private int excludedCount;
   private static int listCount = 0;
/**
* Constructors for the BakedItemList class.
* 
*/
   public BakedItemList() {
      listName = ""; 
      itemList = new BakedItem[100]; 
      itemCount = 0; 
      excludedRecords = new String[30]; 
      excludedCount = 0; 
      listCount++;
   }
/**
   * This method returns the list name.
   * @return the list name.
   */
   public String getListName() {
      return listName;
   }
   
   /**
   * This method sets the list name.
   * @param nameIn is the name entered.
   */
   public void setListName(String nameIn) {
      listName = nameIn;
   }
/**
   * This method gets the item list.
   * @return the item list.
   */
   public BakedItem[] getItemList()
   {
      return itemList;
   }
   
   /**
   * This method sets the item list.
   * @param listIn is the list entered.
   */
   public void setItemList(BakedItem[] listIn)
   {
      itemList = listIn;
   }
/**
   * This method gets the item count.
   * @return the item count.
   */
   public int getItemCount() {
      return itemCount;
   }
 /**
   * This method sets the item count.
   * @param countIn is the item count entered.
   */
   public void setItemCount(int countIn)
   {
      itemCount = countIn;
   }
   /**
   * This method gets the excluded records.
   * @return the excluded records.
   */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   * This method sets the excluded records.
   * @param recordsIn is the records entered.
   */
   public void setExcludedRecords(String[] recordsIn) {
      excludedRecords = recordsIn;
   }
   /**
   * This method gets the excluded count.
   * @return the excluded count.
   */
   public int getExcludedCount() {
      return excludedCount;
   }
   
   /**
   * This method sets the excluded count.
   * @param countIn is the excluded count entered.
   */
   public void setExcludedCount(int countIn) {
      excludedCount = countIn;
   }
   
   /**
   * This method gets the list count.
   * @return the list count.
   */
   public static int getListCount() {
      return listCount;
   }
   
   /**
   * This method resets the list count.
   */
   public static void resetListCount() {
      listCount = 0;
   }
/** 
* This method reads the item file.
* @param file is the file title in the project folder. 
* @throws FileNotFoundException for reading the file. 
*/
   public void readItemFile(String file) throws FileNotFoundException {
      Scanner scanFile = new Scanner(new File(file)); 
      listName = scanFile.nextLine();
      while (scanFile.hasNext()) {
         String line = scanFile.nextLine();
         Scanner scanBakedItem = new Scanner(line);
         scanBakedItem.useDelimiter(",");
         try {
            String category = scanBakedItem.next();
            char choice = category.charAt(0);
            String nameIn = scanBakedItem.next();
            String flavorIn = scanBakedItem.next();
            int quantityIn = Integer.parseInt(scanBakedItem.next());
            String[] ingredientsIn = new String[50];
            BakedItem b;
            String [] duplicate;
            int count = 0;
            double crustCostIn;
            int layersIn, tiersIn;
         
            switch (choice) { 
               case 'C': 
                  while (scanBakedItem.hasNext()) {
                     ingredientsIn[count++] = scanBakedItem.next();
                  }
                  duplicate = Arrays.copyOf(ingredientsIn, count);
                  b = new Cookie(nameIn, flavorIn, quantityIn, duplicate);
                  itemList[itemCount++] = b;
                  break;
                   
               case 'P': 
                  crustCostIn = Double.parseDouble(scanBakedItem.next());
                  while (scanBakedItem.hasNext()) {
                     ingredientsIn[count++] = scanBakedItem.next();
                  }
                  duplicate = Arrays.copyOf(ingredientsIn, count); 
                  b = new Pie(nameIn, flavorIn, quantityIn, 
                     crustCostIn, duplicate);
                  itemList[itemCount++] = b;
                  break;
             
               case 'K': 
                  layersIn = Integer.parseInt(scanBakedItem.next()); 
                  while (scanBakedItem.hasNext()) {
                     ingredientsIn[count++] = scanBakedItem.next(); 
                  }
                  duplicate = Arrays.copyOf(ingredientsIn, count); 
                  b = new Cake(nameIn, flavorIn, quantityIn, 
                     layersIn, duplicate);
                  itemList[itemCount++] = b;
                  break; 
              
               case 'W': 
                  layersIn = Integer.parseInt(scanBakedItem.next());
                  tiersIn = Integer.parseInt(scanBakedItem.next());
                  while (scanBakedItem.hasNext()) {
                     ingredientsIn[count++] = scanBakedItem.next();
                  }
                  duplicate = Arrays.copyOf(ingredientsIn, count); 
                  b = new WeddingCake(nameIn, flavorIn, quantityIn, 
                     layersIn, tiersIn, duplicate);
                  itemList[itemCount++] = b;
                  break; 
              
               default:
                  throw new InvalidCategoryException(category);   
            } 
         }
         catch (InvalidCategoryException e) {
            String result = "*** " + e + " in:\n" + line;
            excludedRecords[excludedCount++] = result;
         }
         catch (NoSuchElementException e) {
            String result = "*** " + e + " in:\n" + line;
            excludedRecords[excludedCount++] = result;
         }
         catch (NumberFormatException e) {
            String result = "*** " + e + " in:\n" + line;
            excludedRecords[excludedCount++] = result;
         }
      }
      scanFile.close();
   }

/**
   * This method generates a report of the item list.
   * @return the report.
   */
   public String generateReport()
   {
      BakedItem[] sortedList = Arrays.copyOf(itemList, itemCount);
   
      String result = "";
      for (BakedItem x: sortedList)
      {
         result += "\n" + x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Report for " + listName
         + "\n----------------------------------------\n" + result;
   }
/**
   * This method generates a report of the items sorted in order by class.
   * @return the sorted report.
   */
   public String generateReportByClass()
   {
      BakedItem[] fixedList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(fixedList);
      
      String result = "";
      for (BakedItem x: fixedList)
      {
         result += "\n" + x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Report for " + listName + " (by Class)"
         + "\n----------------------------------------\n" + result;
   }
/**
   * This method generates a report of the items sorted by the price.
   * @return the report.
   */
   public String generateReportByPrice()
   {
      BakedItem[] fixedList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(fixedList, new PriceComparator());
   
      String result = "";
      for (BakedItem x: fixedList)
      {
         result += "\n" + x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Report for " + listName + " (by Price)"
         + "\n----------------------------------------\n" + result;
   }
/**
   * This method generates a report of the items sorted by the flavor.
   * @return the sorted report.
   */
   public String generateReportByFlavor()
   {
      BakedItem[] fixedList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(fixedList, new FlavorComparator());
   
      String result = "";
      for (BakedItem x: fixedList)
      {
         result += "\n" + x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Report for " + listName + " (by Flavor)"
         + "\n----------------------------------------\n" + result;
   }
/**
   * This method generates a report of the excluded records.
   * @return the report.
   */
   public String generateExcludedRecordsReport()
   {
      String[] fixedList = Arrays.copyOf(excludedRecords, excludedCount);
      String result = "";
      for (String x: fixedList)
      {
         result += x.toString() + "\n";
      }
      return "\n----------------------------------------\n"
         + "Excluded Records Report"
         + "\n----------------------------------------\n\n" + result;
   }
}