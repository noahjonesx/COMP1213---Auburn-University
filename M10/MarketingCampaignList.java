import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**Project 10 - MarketingCampaignList.
*@author Noah Jones
*@version 04/08/2021
*/

public class MarketingCampaignList {

//fields

   private MarketingCampaign[] campaignList;
   private String[] invalidRecords;

//constructor

/**
*Initializes all variables
*/

   public MarketingCampaignList() {
      MarketingCampaign[] campaignList = new MarketingCampaign[0];
      String[] invalidRecords = new String[0];
   }
   
   public MarketingCampaign[] getMarketingCampaignArray() {
      return campaignList;
   }
   
   public String[] getInvalidRecordArray() {
      return invalidRecords;
   }
   
   public void addMarketingCampaign(MarketingCampaign newMarketingElement) {
      campaignList = Arrays.copyOf(campaignList, campaignList.length + 1);
      campaignList[campaignList.length - 1] = newMarketingElement;
   }
   
   public void addInvalidRecord (String newElement) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = newElement;
   }
   
   public void readFile(String fileIn) throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileIn));
      
      while (fileScan.hasNextLine()) {
         String line = fileScan.nextLine();
         Scanner scan = new Scanner(line);
         scan.useDelimiter(",");
      
         char category = scan.next().charAt(0);
         String name = scan.next();
         double revenue = Double.parseDouble(scan.next());
         MarketingCampaign obj;
      
         switch (category) {
         
            case 'D':
               double costPerMail = Double.parseDouble(scan.next());
               int numberOfMail = Integer.parseInt(scan.next());
               obj = new DirectMC(name, revenue, costPerMail, numberOfMail);
               addMarketingCampaign(obj);
               break;
            
            case 'I':
               double costPerAd = Double.parseDouble(scan.next());
               int numberOfAds = Integer.parseInt(scan.next());
               obj = new IndirectMC(name, revenue, costPerAd, numberOfAds);
               addMarketingCampaign(obj);
               break;
         
            case 'S':
               double costPerAd2 = Double.parseDouble(scan.next());
               int numberOfAds2 = Integer.parseInt(scan.next());
               obj = new SearchEngineMC(name, revenue,
                                    costPerAd2, numberOfAds2);
               addMarketingCampaign(obj);
               break;
            
            case 'M':
               double costPerAd3 = Double.parseDouble(scan.next());
               int numberOfAds3 = Integer.parseInt(scan.next());
               obj = new SocialMediaMC(name, revenue,
                                    costPerAd3, numberOfAds3);
               addMarketingCampaign(obj);
               break;
         
            default:
               addInvalidRecord(name);
         }
      }
   }
      
   public String generateReport() {
      String report = "";
      MarketingCampaign[] xList = Arrays.copyOf(campaignList, campaignList.length);
         
      for (MarketingCampaign obj : xList) {
         report += "\n" + obj.toString() + "\n";
      }
         
      return "------------------------------\n"
               + "Marketing Campaign Report\n"
               + "------------------------------\n"
               + report;
   }

   public String generateReportByName() {
      String report = "";
      MarketingCampaign[] xList = Arrays.copyOf(campaignList, campaignList.length);
      Arrays.sort(xList);
         
      for (MarketingCampaign obj : xList) {
         report += "\n" + obj.toString() + "\n";
      }
         
      return "----------------------------------------\n"
               + "Marketing Campaign Report\n"
               + "----------------------------------------\n"
               + report;
   }
      
   public String generateReportByCampaignCost() {
      String report = "";
         
      MarketingCampaign[] xList = Arrays.copyOf(campaignList, campaignList.length);
      Arrays.sort(xList, new CampaignCostComparator());
         
      for (MarketingCampaign obj : xList) {
         report += "\n" + obj.toString() + "\n";
      }
         
      return "-------------------------------------------------\n"
               + "Marketing Campaign Report (by Lowest Campaign Cost)\n"
               + "-------------------------------------------------\n"
               + report;
   }
      
   public String generateReportByROI() {
      String report = "";
         
      MarketingCampaign[] xList = Arrays.copyOf(campaignList, campaignList.length);
      Arrays.sort(xList, new ROIComparator());
         
      for (MarketingCampaign obj : xList) {
         report += "\n" + obj.toString() + "\n";
      }
         
      return "-------------------------------------------------\n"
               + "Marketing Campaign Report (by Highest ROI)\n"
               + report;
   }

            
      
      
      
   
   
   
}