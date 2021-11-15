/**
* Derived from IndirectMC.
* @author Noah Jones
* @version 03/31/2021
*/

public class SocialMediaMC extends IndirectMC {
   //Instance Variables
   
   /** SocialMediaMC Constant. **/
   public static final double BASE_COST = 3000.0;
   
   //Constuctor
   
   /**
   * @param nameIn inputs name
   * @param revenueIn inputs revenue
   * @param costPerAdIn inputs cost per ad
   * @param numberOfAdsIn inputs number of ads
   */
   public SocialMediaMC(String nameIn, double revenueIn,
                     double costPerAdIn, int numberOfAdsIn) {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }

   //Methods
   /**return.
   * @return BASE_COST returns base cost
   */
   public double getBaseCost() {
      return BASE_COST;
   }
}