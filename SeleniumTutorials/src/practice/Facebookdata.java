package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Facebookdata extends WebDriverFactory {
	

	 public static void switchToWindow(int index)
 	{
 		List<String> list = new ArrayList<String>(getDriver().getWindowHandles());
 		getDriver().switchTo().window(list.get(index));
 	}
 	
 	public static void switchToRootCloseCurrent()
 	{
 		List<String> list = new ArrayList<String>(getDriver().getWindowHandles());
 		for(int i=1;i<list.size();i++)
 		{
 			getDriver().switchTo().window(list.get(i));
 			getDriver().close();
 		}
 		getDriver().switchTo().window(list.get(0));
 	}
	
	
	@Test
	
	public void Datapolicy() throws InterruptedException{
		getDriver().findElement(By.id("privacy-link")).click();
	    switchToWindow(1);
	    
		getDriver().findElement(By.xpath(".//*[@id='u_0_v']/div/div[1]/div/div[1]")).click();;
		String actualres = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Things you do and information you provide.']")).getText();
		String expres = ("Things you do and information you provide.");
		Assert.assertEquals(actualres, expres);
		String actualres1 = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Things others do and information they provide.']")).getText();
		String expres1 = ("Things others do and information they provide.");
		Assert.assertEquals(actualres1, expres1);
		String actualres2 = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Your networks and connections.']")).getText();
		String expres2 = ("Your networks and connections.");
		Assert.assertEquals(actualres2, expres2);
		String actualres3 = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Information about payments.']")).getText();
		String expres3 = ("Information about payments.");
		Assert.assertEquals(actualres3, expres3);
		String actualres4 = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Device information.']")).getText();
		String expres4 = ("Device information.");
		Assert.assertEquals(actualres4, expres4);
		String actualres5 = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Information from websites and apps that use our Services.']")).getText();
		String expres5 = ("Information from websites and apps that use our Services.");
		Assert.assertEquals(actualres5, expres5);
		String actualres6 = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Information from third-party partners.']")).getText();
		String expres6 = ("Information from third-party partners.");
		Assert.assertEquals(actualres6, expres6);
		String actualres7 = getDriver().findElement(By.xpath(".//*[@class='_1z2h' and text() = 'Facebook companies.']")).getText();
		String expres7 = ("Facebook companies.");
		Assert.assertEquals(actualres7, expres7);
		
		Thread.sleep(2500);
		switchToRootCloseCurrent();	
		Thread.sleep(1000);
		
	}

}
