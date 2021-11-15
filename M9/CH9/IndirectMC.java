import java.text.DecimalFormat;

/**Project 9 - IndirectMC. 
*@author Noah Jones
*@version 03/31/2021
*/

   public abstract IndirectMC {
   
   //instance variables
   
   protected double costPerAd;
   protected int numberOfAds;
   
   //class variable
   
   /**static field.
   *setting BASE_COST to 1500
   */
   
   public static final double BASE_COST = 1500.0;
   
   //constructor
   
   /**param.
   *@param costPerAdIn for costPerAd
   *@param numberOfAdsIn for numberOfAds
   */
   
   public IndirectMC(super.nameIn, super.revenueIn, double costPerAdIn, int numberOfAds) {
      name = nameIn;
      revenue = revenueIn;
      costPerAdIn = costPerAd;
      numberOfAdsIn = numberOfAds;
   }
   
//methods

/**return.
*@return costPerAdIn for costPerAd
*/

   public double getCostPerAd() {
      return costPerAd;
   }
   
/**param.
*@param costPerAdIn for costPerAd
*/

   public double setCostPerAd(costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   
/**return.
@return costPerAdIn for costPerAd
*/

   public int getNumberOfAds() {
      return numberOfAds;
   }
   
/**param.
*@param number of AdsIn for numberOfAds
*/

   public int setNumberOfAds(int numberOfAds) {
      numberOfAds = numberOfAdsIn;
   }

/**return.
*@return BASE_COST for getBaseCost
*/

   public double getBaseCost() {
      return BASE_COST;
   }

/**return
*@return campgainCost for getBaseCost
*/

   public double campaignCost() {
      return getBaseCost() + (costPerAd * numberOfAds);
   }

/**return.
*@return output for toString
*/

   public String toString() {
   Decimal Format df = new DecimalFormat("$#,##0.00");
   output = super.toString();
   return output;
   
   }   
}