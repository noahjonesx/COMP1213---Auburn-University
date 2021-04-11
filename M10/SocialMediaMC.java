
/**
* Derived from IndirectMC.
*
* @author Noah Jones
* @version 03/30/20210.00
*/
public class SocialMediaMC extends IndirectMC {
   //Instance Variables
   
   /** SocialMediaMC Constant. **/
   public static final double BASE_COST = 3000.0;
   
   //Constuctor
   /**
   * Constructor Method.
   *
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
   /**
   * Returns the constant of this class.
   *
   * @return BASE_COST returns base cost
   */
   public double getBaseCost() {
      return BASE_COST;
   }
}
