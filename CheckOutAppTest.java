import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CheckOutAppTest{


	@Test
	public void testCustomersNameMethod(){
	
  	CheckOutApp checkOutApp = new CheckOutApp();  
  	checkOutApp.setCustomersName("Chukwuma Adekunle Ciroma");
  	String expected = "Chukwuma Adekunle Ciroma";
  	String actual = checkOutApp.getCustomersName();	
  	
  	assertEquals(expected, actual);


	}
	
	@Test
	public void testCashiersNameMethod(){
	
  	CheckOutApp checkOutApp = new CheckOutApp();  
  	checkOutApp.setCashiersName("Oluwaseyi");
  	String expected = "Oluwaseyi";
  	String actual = checkOutApp.getCashiersName();
  	
  	assertEquals(expected, actual);	
	}
	
	@Test
	public void testGetAmountPaid(){

  	CheckOutApp checkOutApp = new CheckOutApp();  
  	checkOutApp.setAmountPaid(6000);
  	double expected =(6000.0);
  	double actual = checkOutApp.getAmountPaid();
  	
  	assertEquals(expected, actual);
	}
	
	@Test
	public void testGetDiscount(){
  	CheckOutApp checkOutApp = new CheckOutApp();  
  	checkOutApp.setDiscount(8.0);
  	checkOutApp.setSubTotal(5300.0);
  	double expected = (424.0);
  	double actual = checkOutApp.getDiscount();
  	
  	assertEquals(expected, actual);
	}
	
	@Test
	public void testValueAddedTaxMethod(){
	
	CheckOutApp checkOutApp = new CheckOutApp();
	checkOutApp.setSubTotal(5300.0);
	double expected = (397.50);
	double actual = checkOutApp.valueAddedTaxMethod();
	
	assertEquals(expected, actual); 
	}
	
	@Test
	public void testBillTotalMethod(){
	
	CheckOutApp checkOutApp = new CheckOutApp();
	checkOutApp.setSubTotal(5300.0);
	checkOutApp.setDiscount(8.0);
	checkOutApp.valueAddedTaxMethod();
	double expected = (5273.50);
	double actual = checkOutApp.billTotalMethod();
	
	assertEquals(expected, actual);
	}
	
	@Test
	public void testSubTotalMethod(){
	
	CheckOutApp checkOutApp = new CheckOutApp();
	checkOutApp.setSubTotal(5300.0);
	double expected = (5300.0);
	double actual = checkOutApp.getSubTotal();
	
	assertEquals (expected, actual);
	}
}
