import java.text.DecimalFormat;

/** Project 9 - DirectMC
*@author Noah Jones
*@version 03/31/2021
*/

public class DirectMC extends MarketingCampaign {
   
//instance variables
   
   private double costPerMailPiece;
   private int numberOfMailPieces;
   
//class constant   
   
   public static final double BASE_COST = 1000;
   
 //constructor
 
 /**param.
 *@param nameIn for name
 *@param revenueIn for revenue
 */
 
   public DirectMC (super.nameIn, super.revenueIn) {   
   }
   
//methods

/**return.
*@return  costPerMailPiece for getCostPerMailPiece
*/

   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }

/**param.
*@param costPerMailPiece for getCostPerMailPiece
*/

   public double setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }

/**return.
@return numberOfMailPiecesIn for numberOfMailPieces
*/

   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }

/**param.
*@param numberOfMailPiecesIn for numberOfMailPieces
*/

   public int setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }

/**return.
*@return BASE_COST for campaignCost
*/

   public double campaignCost() {
      return BASE_COST + (costPerMailPiece * numberOfMailPieces);
   }
   
/**return.
*@return output for toString
*/

   public String toString() {
      DecimalFormat df = new DecimalFormat("$#,##0.00");
      DecimalFormat df2 = new DecimalFormat("0.##%");
      output = super.toString();
      return output;
   }
   
}