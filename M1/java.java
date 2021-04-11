/**
      * Program of NumberOperations.
      *
      * Activity 5
      * @version 09/17/2017 
      */
public class NumberOperations
{
   private int number;
  
 /**param.
  * @param numberIn for numberIn
  */
   public NumberOperations(int numberIn)
   {
      number = numberIn;
   }
   /**
    *Get value number.  
    *@return getValue
    */
   public int getValue()
   {
      return number;
   }
   
   
   /**  
    * @return String
    */

   public String oddsUnder()
   {
      String output = "";
      int i = 0;
      while (i < number)
      {
         if (i % 2 != 0)
         {
            output += i + "\t";
         }
         i++;
      }
      return output;
   } 
   
    /**  
     * @return String
   */

   public String powersTwoUnder()
   {
      String output = "";
      int powers = 1;
      while (powers < number)
      {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
/**  
    * @return String
    * @param compareNumber for compare number
   */
   public int isGreater(int compareNumber)
   {
      if (number > compareNumber)
      {
         return 1;
      }
      else if (number < compareNumber)
      {
         return -1;
      }
      else
      {
         return 0;
      }
   }
   
    /**  
     @return String
   */
   public String toString()
   {
      return number + "";
   }
}