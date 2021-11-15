import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class BankLoanTest {

@Test public void chargeInterestTest() {
   BankLoan loan1 = new BankLoan("Jane", .10);
   loan1.borrowFromBank(1000.00);
   loan1.chargeInterest();
   Assert.assertEquals(" ", loan1.getBalance(), .000001);
   }
}
