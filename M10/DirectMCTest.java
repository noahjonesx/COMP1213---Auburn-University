import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** Test program for DirectMC. **/
public class DirectMCTest {
  //Instance Variable
   private DirectMC mc1 = new DirectMC("Ad Mailing", 10000.0, 3.0, 2000);

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test for setCostPerMailPiece and getCostPerMailPiece methods. **/
   @Test public void costPerMailPieceTest() {
      mc1.setCostPerMailPiece(2.0);
     
      Assert.assertEquals(2.0, mc1.getCostPerMailPiece(), 0.01);
   }
   
   /** Test for setNumberOfMailPieces and getNumberOfMailPieces methods. **/
   @Test public void numberOfMailPiecesTest() {
      mc1.setNumberOfMailPieces(2500);
     
      Assert.assertEquals(2500, mc1.getNumberOfMailPieces(), 0.01);
   }
   
   /** Test for campaignCost method. **/
   @Test public void campaignCostTest() {
      Assert.assertEquals(7000.0, mc1.campaignCost(), 0.01);
   }
   
   /** Test for toString method. **/
   @Test public void toStringTest() {
      String expected = "Ad Mailing (class DirectMC)\n"
                        + "Revenue: $10,000.00   Campaign Cost: $7,000.00"
                        + "   ROI: 42.86%\n"
                        + "   Base Cost: $1,000.00\n"
                        + "   Mail Cost: $6,000.00 = $3.00 per mail piece "
                        + "* 2000 mail pieces";
                       
      Assert.assertEquals(expected, mc1.toString());
   }
   
   /** Test for setName and getName methods. **/
   @Test public void nameTest() {
      mc1.setName("Test");
     
      Assert.assertEquals("Test", mc1.getName());
   }
   
   /** Test for setRevenue and getRevenue methods. **/
   @Test public void revenueTest() {
      mc1.setRevenue(9000);
     
      Assert.assertEquals(9000, mc1.getRevenue(), 0.01);
   }
   
   
   /** Test for getCount and resetCount methods. **/
   @Test public void countTest() {
      DirectMC.resetCount();
     
      DirectMC mc0 = new DirectMC("Ad Mailing", 10000.0, 3.0, 2000);
     
      Assert.assertEquals(1, DirectMC.getCount());
   }
}

