import java.text.DecimalFormat;
/**
* Derived from the MarketingCampaign class.
*
* @author Noah Jones
* @version 03/30/2021
*/
public class IndirectMC extends MarketingCampaign {
   //Instance Variables
   protected double costPerAd;
   protected int numberOfAds;
   
   /** IndirectMC Constant. **/
   public static final double BASE_COST = 1500.0;
   
   //Constuctor
   /**
   * Constuctor method.
   *
   * @param nameIn inputs name
   * @param revenueIn inputs revenue
   * @param costPerAdIn inputs cost per ad
   * @param numberOfAdsIn inputs number of ads
   */
   public IndirectMC(String nameIn, double revenueIn,
                     double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;                
   }
   
   //Methods
   /**
   * Returns cost per ad.
   *
   * @return costPerAd returns cost per ad
   */
   public double getCostPerAd() {
      return costPerAd;
   }
   
   /**
   * Sets the cost per ad.
   *
   * @param costPerAdIn inputs cost per ad
   */
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   
   /**
   * Returns number of ads.
   *
   * @return numberOfAds returns number of ads
   */
   public int getNumberOfAds() {
      return numberOfAds;
   }
   
   /**
   * Sets number of ads.
   *
   *@param numberOfAdsIn inputs number of ads
   */
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;  
   }
   
   /**
   * Returns the constant of this class.
   *
   * @return BASE_COST returns base cost
   */
   public double getBaseCost() {
      return BASE_COST;
   }
   
   /**
   * Returns campaign cost.
   *
   * @return campaign cost
   */
   public double campaignCost() {
      return getBaseCost() + (costPerAd * numberOfAds);
   }
   
   /**
   * toString method.
   *
   * @return toString
   */
   public String toString() {
      DecimalFormat mon = new DecimalFormat("$#,##0.00");
      DecimalFormat percent = new DecimalFormat("0.##%");
     
      double adCost = costPerAd * numberOfAds;
   
      return super.toString()
             + "   Base Cost: " + mon.format(getBaseCost()) + "\n"
             + "   Ad Cost: " + mon.format(adCost)
             + " = " + mon.format(getCostPerAd()) + " per ad * "
             + getNumberOfAds() + " ads";
   }
}

