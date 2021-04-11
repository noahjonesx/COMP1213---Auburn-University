/**Activity 9 - ElectronicsItem.
*@author Noah Jones
*@version 03/30/2021
*/

public class ElectronicsItem extends InventoryItem {

//instance variables

/**param.
*@param SHIPPING COST for weight
*/

   public static final double SHIPPING_COST = 1.5;
   protected double weight;

//constructor

/**param.
*@param nameIn for name
*@param priceIn for price 
*@param weightIn for weight
*/

   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }
   
/**return.
*@return calculateCost for SHIPPING_COST
*/

   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }


}