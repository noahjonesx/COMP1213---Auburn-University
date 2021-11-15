/**Activity 11 - Divison.
*@author Noah Jones
*@version 04/12/2021
*/

public class Division {
 

 /**param / return.
 *@return int for intDivide
 *@param num for intDivide
 *@param denom for intDivide
 */
 
   public static int intDivide(int num, int denom) {
      try 
      {
         return (num / denom);
      }
      catch (ArithmeticException e)
      {
         return 0;
      }
   }
 
 /**return / param / throws.
 *@throws IllegalArgumentException incase of denom of zero
 *@param denom casted to double
 *@param num casted to double
 *@return double for num / denom
 */

   public static double decimalDivide(int num, int denom) {
      if (denom == 0) {
         throw new IllegalArgumentException("The denominator "
                  + "cannot be zero.");
      }
      
      return (double) num / (double) denom;   
   }
}