
/**
* Derived from IndirectMC.
*
* @author Noah Jones
* @version 03/30/2021
*/
public class SearchEngineMC extends IndirectMC {
   //Instance Variables
   
   /** SearchEngineMC Base Cost. **/
   public static final double BASE_COST = 2000.0;
   
   //Constructor
   /**
   * Constuctor method.
   *
   * @param nameIn inputs name
   * @param revenueIn inputs revenue
   * @param costPerAdIn inputs cost per ad
   * @param numberOfAdsIn inputs number of ads
   */
   public SearchEngineMC(String nameIn, double revenueIn,
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

