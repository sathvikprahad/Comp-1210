import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
*Reads and prints the information found from data in HexagonalPrismList files.
*
*Project 5
*@author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
*@version 09/23/2022
*/
public class HexagonalPrismListApp {
/** 
*Uses user input to call on methods in this file and produce data.
*
*@param args command line arguments - not used.
*@throws IOException when there is an input output exception 
*/
   public static void main(String[] args) throws IOException {
      //initialization of variables
      ArrayList<HexagonalPrism> list = new ArrayList<HexagonalPrism>();
      String name = "";
      String nameOfList = "";
      String label = "";
      double height = 0.0;
      double edge = 0.0;
      //gets file name
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = sc.nextLine();
      //allows for info to be gotten from file
      Scanner scan = new Scanner(new File(fileName));
      nameOfList = scan.nextLine();
      System.out.println();
      //as long as there is more info it will be taken in
      while (scan.hasNext()) {
         label = scan.nextLine();
         edge = Double.parseDouble(scan.nextLine());
         height = Double.parseDouble(scan.nextLine());
         HexagonalPrism object = new HexagonalPrism(label, edge, height);
         list.add(object);
      }
      //prints information in a formatted way
      HexagonalPrismList newList = new HexagonalPrismList(nameOfList, list);
      String newToString = newList.toString().replace(", A", "A");
      System.out.print(newToString.replace("[", "").replace("]", ""));
      System.out.println(newList.summaryInfo());
      
   }
}