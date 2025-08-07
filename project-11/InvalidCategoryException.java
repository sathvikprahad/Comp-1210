/**
* The InvalidCategoryException makes an exception.
*
* Project 11
* @author Sathvik Prahadeeswaran - Fundamentals of Computing 1 - 1210
* @version 11/17/2022
*/
public class InvalidCategoryException extends Exception
{
   /**.
   * User defined exception which is thrown and caught in BakedItemList
   @param category is the invalid category
   */
   public InvalidCategoryException(String category)
   {
      super("For category: " + "\"" + category + "\"");
   }
   
}