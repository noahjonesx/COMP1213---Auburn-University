/**Activity 10 - ItemsList.
*@author Noah Jones
*@version 04/06//2021
*/

public class ItemsList {

//instance variable

/**
*
*/

private InventoryItem[] inventory;
private int count;

//constructor

/**
*
*/

   public ItemsList() {
      item = new InventoryItem[20];
      count = 0;
   }
   
/**param.
*@param itemIn for item
*/

   public void addItem(InventoryItem itemIn) {
      item = itemIn;
      count++;
}

/**return.
*@return electronicsSurcharge for calculateTotal
*/

   public double calculateTotal(double electronicsSurcharge) {
      //return
   }

/**return.
*@return output for toString
*/

   public String toString() {
      String output =  "All inventory: \n\n";
      
      for (int i = 0; i < count; i++) {
         output += InventoryItem[i] + "\n";
      }
      return output;
   }
   
   
   }