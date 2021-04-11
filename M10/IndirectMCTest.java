import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Test program for IndirectMC. **/
public class IndirectMCTest {
  //Instance Variable
   private IndirectMC mc2 = new IndirectMC("Web Ads 1", 15000.0, 2.0, 3500);

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests setCostPerAd and getCostPerAd methods. **/
   @Test public void costPerAdTest() {
      mc2.setCostPerAd(3.0);
     
      Assert.assertEquals(3.0, mc2.getCostPerAd(), 0.01);
   }
   
   /** Tests setNumberofAds and getNumberOfAds methods. **/
   @Test public void numberOfAdsTest() {
      mc2.setNumberOfAds(2500);
     
      Assert.assertEquals(2500, mc2.getNumberOfAds(), 0.01);
   }
   
   /** Tests getBaseCost method. **/
   @Test public void getBaseCostTest() {
      Assert.assertEquals(1500, mc2.getBaseCost(), 0.01);
   }
   
   /** Tests campaignCost method. **/
   @Test public void campaignCostTest() {
      Assert.assertEquals(8500, mc2.campaignCost(), 0.01);
   }
   
   /** Tests toString method. **/
   @Test public void toStringTest() {
      String expected = "Web Ads 1 (class IndirectMC)\n"
                        + "Revenue: $15,000.00   Campaign Cost: $8,500.00"
                        + "   ROI: 76.47%\n"
                        + "   Base Cost: $1,500.00\n"
                        + "   Ad Cost: $7,000.00 = $2.00 per ad "
                        + "* 3500 ads";
                       
      Assert.assertEquals(expected, mc2.toString());
   }
}

