package testcase;




import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass {
	

	@Test(dataProvider="fetchData")
	public  void runCreateLead(String company,String fName,String lName,String phoneNumber) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="fetchData")
	
	public String[][] sendData() throws IOException {
		


return ReadExcel.readExcel("CreateLead");
		
		
	}
}






