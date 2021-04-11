import java.text.DecimalFormat;
/**
* Abstract for Marketing Campaign class that
* describes marketing campaign data.
*
* @author Noah Jones
* @version 03/30/2021
*/
public abstract class MarketingCampaign {
   //Instance Variables
   protected String name;
   protected double revenue;
   protected static int count = 0;
   
   //Constuctor
   /**
   * Initializes all variables.
   *
   * @param nameIn inputs name
   * @param revenueIn inputs revenue
   */
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   
   //Methods
   /**
   * Returns the name of the object.
   *
   * @return name of the object
   */
   public String getName() {
      return name;
   }
   
   /**
   * Sets the name of the object.
   *
   * @param nameIn inputs name.
   */
   public void setName(String nameIn) {
      name = nameIn;
   }
   
   /**
   * Returns revenue.
   *
   * @return revenue returns revenue
   */
   public double getRevenue() {
      return revenue;
   }
   
   /**
   * Sets the revenue.
   *
   * @param revenueIn inputs revenue
   */
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
   /**
   * Returns number of objects.
   *
   * @return count returns number of objects
   */
   public static int getCount() {
      return count;
   }
   
   /**
   * Resets number of objects.
   */
   public static void resetCount() {
      count = 0;
   }
   
/**return.
*@return revenue for return
*/

   public double calcROI() {
      return (revenue - campaignCost()) / campaignCost();
   }
   
 
   
   /**
   * toString method.
   *
   * @return formated result
   */
   public String toString() {
      DecimalFormat mon = new DecimalFormat("$#,##0.00");
      DecimalFormat percent = new DecimalFormat("0.##%");
   
   
      return getName() + " (" + this.getClass() + ")\n"
             + "Revenue: " + mon.format(getRevenue())
             + "   Campaign Cost: " + mon.format(campaignCost())
             + "   ROI: " + percent.format(calcROI()) + "\n";
   }
   
   /**
   * Cost of the campaign.
   *
   * @return cost
   */
   public abstract double campaignCost();
}

