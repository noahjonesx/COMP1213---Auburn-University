/**Activity 9 - OnlineBook.
*@author Noah Jones
*@version 03/30/2021
*/

public class OnlineBook extends OnlineTextItem {

// instance variables

   protected String author;

// constructor

/**param.
*@param nameIn for name
*@param priceIn for price
*/

   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

// methods 

/**param.
*@param authorIn for author
*/

   public void setAuthor(String authorIn) {
      author = authorIn;
   }

/**return.
*@return name for toString
*/   
   
   public String toString() {
      return name + " - " + author + ": $" + calculateCost();
   }
}