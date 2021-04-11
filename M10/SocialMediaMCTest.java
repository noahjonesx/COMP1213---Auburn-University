import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Test program for SocialMediaMC. **/
public class SocialMediaMCTest {
  //Instance Variable
   private SocialMediaMC mc4 = new SocialMediaMC("Web Ads 3", 35000.0,
                                                 3.0, 8000);

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests getBaseCost method. **/
   @Test public void getBaseCostTest() {
      Assert.assertEquals(3000, mc4.getBaseCost(), 0.01);
   }
}