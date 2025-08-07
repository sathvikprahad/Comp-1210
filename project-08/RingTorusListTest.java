import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**.
* The tester class for the RingTorusList class. 
*
* Project 8
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 10/27/2022
*/

public class RingTorusListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** 
   Tests the getName method. 
   **/
   @Test public void nameTest() {
      RingTorus[] list2 = new RingTorus[10];
      RingTorusList newList = 
         new RingTorusList("Tester name", list2, 0);
      Assert.assertEquals("Tester name", newList.getName());
   }
   
   /** 
   Tests the numberOfRingToruses method. 
   **/
   @Test public void numberOfRingToruses() {
      RingTorus a = new RingTorus("Example", 2.0, 4.0);
      RingTorus[] list2 = new RingTorus[10];
      int size = 0;
      for (int i = 0; i < 10; i++) {
         size++;
         list2[i] = a;
      }
      
      RingTorusList torusList = 
         new RingTorusList("Test", list2, size);
      Assert.assertEquals(10, torusList.numberOfRingToruses());
      RingTorus[] list3 = new RingTorus[10];
      RingTorusList torusList2 = 
         new RingTorusList("Test", list3, size);
      Assert.assertEquals(0, torusList2.numberOfRingToruses());
      RingTorusList torusList3 = 
         new RingTorusList("Test", list3, 0);
      Assert.assertEquals(0, torusList2.numberOfRingToruses());
   }
   /** 
   Tests the totalDiameter method. 
   **/
   @Test public void diameterTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      double dia = a.diameter() + b.diameter();
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      Assert.assertEquals(dia, list3.totalDiameter(), .0001);
      RingTorus[] list4 = new RingTorus[5];
      RingTorusList list5 = new RingTorusList("Tester2", list4, 0);
      Assert.assertEquals(0, list5.totalDiameter(), .0001);
   }
   
   /** 
   Tests the totalSurfaceArea method. 
   **/
   @Test public void surfaceAreaTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      double surfArea = a.surfaceArea() + b.surfaceArea();
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      Assert.assertEquals(surfArea, list3.totalSurfaceArea(), .0001);
      RingTorus[] list4 = new RingTorus[5];
      RingTorusList list5 = new RingTorusList("Tester2", list4, 0);
      Assert.assertEquals(0, list5.totalSurfaceArea(), .0001);
   }
   
   /** 
   Tests the totalVolume method. 
   **/
   @Test public void volumeTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      double vol = a.volume() + b.volume();
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Test1", list2, 2);
      Assert.assertEquals(vol, list3.totalVolume(), .0001);
      
      RingTorus[] list4 = new RingTorus[5];
      RingTorusList list5 = new RingTorusList("Test2", list4, 0);
      Assert.assertEquals(0, list5.totalVolume(), .0001);
   }
   /** 
   Tests the averageDiameter method. 
   **/
   @Test public void averageDiameterTest() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      double avDiameter = (a.diameter() + b.diameter()) / 2;
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      Assert.assertEquals(avDiameter, list3.averageDiameter(), .0001);
      RingTorus[] list4 = new RingTorus[5];
      RingTorusList list5 = new RingTorusList("Tester2", list4, 0);
      Assert.assertEquals(0, list5.averageDiameter(), .0001);
   
   }

      
      /** 
      Tests the averageSurfaceArea method. 
      **/
   @Test public void averageSurfaceAreaTest() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      double avSurfArea = (a.surfaceArea() + b.surfaceArea()) / 2;
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      Assert.assertEquals(avSurfArea, list3.averageSurfaceArea(), .0001);
      RingTorus[] list4 = new RingTorus[5];
      RingTorusList list5 = new RingTorusList("Tester2", list4, 0);
      Assert.assertEquals(0, list5.averageSurfaceArea(), .0001);
   
   }
   
   /** 
   Tests the averageVolume method. 
   **/
   @Test public void averageVolumeTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      double avVolume = (a.volume() + b.volume()) / 2;
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      Assert.assertEquals(avVolume, list3.averageVolume(), .0001);
      RingTorus[] list4 = new RingTorus[5];
      RingTorusList list5 = new RingTorusList("Tester2", list4, 0);
      Assert.assertEquals(0, list5.averageVolume(), .0001);
   
   }
   
   /** 
   Tests the toString method for the RingTorusList. 
   **/
   @Test public void toStringTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 4.0, 2.0);
      RingTorus b = new RingTorus("Tester2", 8.0, 4.0);
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester", list2, 4);
      Assert.assertEquals(true, list3.toString().contains(
         "----- Summary for Tester -----\n" 
            + "Number of RingToruses: 2\n"
            + "Total Diameter: 36.0 units\n"
            + "Total Surface Area: 1,579.137 square units\n"
            + "Total Volume: 2,842.446 cubic units\n"
            + "Average Diameter: 18.0 units\n"
            + "Average Surface Area: 789.568 square units\n"
            + "Average Volume: 1,421.223 cubic units"));
   }
   
   /** 
   Tests the getList method. 
   **/
   @Test public void getListTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorusList list3 = new RingTorusList("Tester", list2, 0);
      RingTorus[] p = list3.getList();
      Assert.assertArrayEquals(list2, p);
   
   }
   
   /** 
   Tests the addRingTorus method. 
   **/
   @Test public void addTorusTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus c = new RingTorus("Tester2", 4.0, 8.0);
      
      list2[0] = a;
      list2[1] = c;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      RingTorus p = new RingTorus("Tester2", 3.0, 6.0);
      list3.addRingTorus("Tester2", 3.0, 6.0);
      RingTorus[] b = list3.getList();
      Assert.assertEquals(p, b[2]);
   
   }
   
   /** 
   Tests the findRingTorus method. 
   **/
   @Test public void findTorusTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus c = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      
      list2[0] = c;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      RingTorus a = new RingTorus("Tester3", 3.0, 6.0);
      Assert.assertEquals(b, list3.findRingTorus("Tester2"));
   
   }
   
   /** 
   Tests the deleteRingTorus method. 
   **/
   @Test public void deleteTorusTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      RingTorus l = new RingTorus("Tester2", 3.0, 6.0);
      RingTorus[] p = list3.getList();
      
      Assert.assertEquals(a, p[0]);
      
      list3.deleteRingTorus("Tester1");
      RingTorus[] c = list3.getList();
      RingTorus d = new RingTorus("Tester3", 1.0, 4.0);
      Assert.assertEquals(b, p[0]);
      
      Assert.assertEquals(null, list3.deleteRingTorus("Tester5"));
   
   }
   
   /** 
   Tests the editRingTorus method. 
   **/
   @Test public void editTorusTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 2.0, 4.0);
      RingTorus b = new RingTorus("Tester2", 4.0, 8.0);
      
      list2[0] = a;
      list2[1] = b;
      
      RingTorusList list3 = new RingTorusList("Tester1", list2, 2);
      
      list3.editRingTorus("Tester1", 1.0, 3.0);
      RingTorus d = new RingTorus("Tester3", 1.0, 3.0);
      Assert.assertEquals(a.surfaceArea(), d.surfaceArea(), .001);
   }
   
   /** 
   Tests the findRingTorusWithLargestVolume method. 
   **/
   @Test public void largestVolumeTester() {
      RingTorus[] list2 = new RingTorus[5];
      RingTorus a = new RingTorus("Tester1", 4.0, 2.0);
      RingTorus b = new RingTorus("Tester2", 8.0, 4.0);
      RingTorus c = new RingTorus("Tester3", 13.0, 9.0);
      RingTorus d = new RingTorus("Tester4", 6.0, 3.0);
      
      list2[0] = a;
      list2[1] = b;
      list2[2] = c;
      list2[3] = d;
      
      RingTorusList list3 = new RingTorusList("TesterList1",
         list2, 3);
      RingTorus largest = list3.findRingTorusWithLargestVolume();
      
      Assert.assertEquals(c, largest);
      
      RingTorus[] p = new RingTorus[5];
      RingTorusList list5 = new RingTorusList("Tester5", p, 0);
      RingTorus y = list5.findRingTorusWithLargestVolume();
      Assert.assertEquals(null, y);
   }
}