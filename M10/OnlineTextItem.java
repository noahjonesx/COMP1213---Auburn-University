/**Project 9 - OnlineTextItem.
*@author Noah Jones
*@version 03/30/2021
*/

public abstract class OnlineTextItem extends InventoryItem {

// constructor

/**param.
*@param nameIn for name
*@param priceIn for price
*/

   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

// methods

/**return.
*@return price for priceIn
*/

   public double calculateCost() {
      return price;
   }
}