/**Project 9 - OnlineArticle.
*@author Noah Jones
*@version 03/30/2021
*/

public class OnlineArticle extends OnlineTextItem {

// instance variables

   private int wordCount;

// constructor

/**param.
*@param nameIn for name
*@param priceIn for price
*/

   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
// methods 

/**param.
*@param wordCountIn for wordCount
*/

   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }

}
