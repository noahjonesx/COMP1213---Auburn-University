import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Test program for SearchEngineMC. **/
public class SearchEngineMCTest {
  //Instance Variables
   private SearchEngineMC mc3 = new SearchEngineMC("Web Ads 2", 27500.0,
                                                   2.50, 5000);

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Tests getBaseCost method. **/
   @Test public void getBaseCostTest() {
      Assert.assertEquals(2000, mc3.getBaseCost(), 0.01);
   }
}