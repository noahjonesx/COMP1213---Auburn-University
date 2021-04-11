/**
* ItemsList class.
*
* @author Noah Jones
* @version 04/06/2021
*/
public class ItemsList {
   //Instance Variables
   private InventoryItem[] inventory;
   private int count;
   
   //Constuctor
   /**
   * Constructor method.
   *
   *
   */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
   //Methods
   /**
   * Adds an inventory item to the array.
   *
   * @param itemIn inputs an object of type InventoryItem
   */
   public void addItem(InventoryItem itemIn) {
      if (count < inventory.length) {
         inventory[count++] = itemIn;
      }
   }
   
   /**
   * Calculates total cost.
   *
   * @param electronicsSurcharge inputs extra charge
   * @return total returns total cost
   */
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0.0;
   
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         }
         else {
            total += inventory[i].calculateCost();
         }
      }
      return total;
   }
   
   /**
   * toString method.
   *
   * @return output returns formatted output
   */
   public String toString() {
      String output = "All inventory:\n\n";
     
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
      return output;
   }
}