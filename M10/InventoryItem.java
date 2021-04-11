/**Activity 9 - InventoryItem.
*@author Noah Jones
*@version 03/30/2021
*/

public class InventoryItem {

//instance variables

   protected String name;
   protected double price;
   private static double taxRate = 0;
   
//constructor

/**param.
*@param priceIn for price
*@param nameIn for name
*/

   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }


//methods

/**return.
*@return name for nameIn
*/

   public String getName() {
      return name;
   }

/**return.
*@return taxRate for taxRateIn
*/
  
   public double calculateCost() {
      return price * (1 + taxRate);
   }   
  
  /**param.
  *@param taxRateIn for taxRate
  */
  
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
  
  /**return.
  *@return toString for output
  */
  
   public String toString() {
      return name + ": $" + calculateCost();
   }
   
}
