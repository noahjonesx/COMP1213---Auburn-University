import java.text.DecimalFormat;
/**
* Derived from MarketingCampaign class.
*
* @author Noah Jones
* @version 03/30/2021
*/
public class DirectMC extends MarketingCampaign {
   //Instance Variables
   private double costPerMail;
   private int numberOfMail;
   
   /** DirectMC Base Cost. **/
   public static final double BASE_COST = 1000;
   
   //Constructor
   /**
   * Constuctor class.
   *
   * @param nameIn inputs name
   * @param revenueIn input revenue
   * @param costPerMailIn inputs cost per mail
   * @param numberOfMailIn input number of mail
   */
   public DirectMC(String nameIn, double revenueIn,
                   double costPerMailIn, int numberOfMailIn) {
      super(nameIn, revenueIn);
      costPerMail = costPerMailIn;
      numberOfMail = numberOfMailIn;
   }
   
   //Methods
   /**
   * Returns cost per mail piece.
   *
   * @return costPerMail returns cost per mail
   */
   public double getCostPerMailPiece() {
      return costPerMail;
   }
   
   /**
   * Sets the cost per mail piece.
   *
   * @param costPerMailIn inputs cost per mail
   */
   public void setCostPerMailPiece(double costPerMailIn) {
      costPerMail = costPerMailIn;
   }
   
   /**
   * Returns number of mail pieces.
   *
   * @return numberOfMail returns number of mail pieces
   */
   public int getNumberOfMailPieces() {
      return numberOfMail;
   }
   
   /**
   * Sets the number of mail pieces.
   *
   * @param numberOfMailIn inputs number of mail pieces
   */
   public void setNumberOfMailPieces(int numberOfMailIn) {
      numberOfMail = numberOfMailIn;
   }
   
   /**
   * Calculates cost for DirectMC.
   *
   * @return cost for DirectMC.
   */
   public double campaignCost() {
      return BASE_COST + (costPerMail * numberOfMail);
   }
   
   /**
   * toString method.
   *
   * @return formated toString
   */
   public String toString() {
      DecimalFormat mon = new DecimalFormat("$#,##0.00");
      DecimalFormat percent = new DecimalFormat("0.##%");
   
      double mailCost = getNumberOfMailPieces() * getCostPerMailPiece();
   
      return super.toString()
             + "   Base Cost: " + mon.format(BASE_COST) + "\n"
             + "   Mail Cost: " + mon.format(mailCost)
             + " = " + mon.format(getCostPerMailPiece()) + " per mail piece * "
             + getNumberOfMailPieces() + " mail pieces";
     
   }
}