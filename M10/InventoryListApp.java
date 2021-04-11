/**
* InventoryListApp java program.
*
* @author Noah Jones
* @version 04/05/2021
*/

public class InventoryListApp {
/**
* Main method.
*
* @param args not used
*/
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
   
      ElectronicsItem electronicsItem = new ElectronicsItem("laptop",
                                                         1234.56, 10);
      myItems.addItem(electronicsItem);
   
      InventoryItem inventoryItem = new InventoryItem("motor oil", 9.8);
      myItems.addItem(inventoryItem);
   
      OnlineBook onlineBook = new OnlineBook("All Things Java", 12.3);
      myItems.addItem(onlineBook);
   
      OnlineArticle onlineArticle = new OnlineArticle("Useful Acronyms", 3.4);
      myItems.addItem(onlineArticle);
   
      System.out.println(myItems);
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}
