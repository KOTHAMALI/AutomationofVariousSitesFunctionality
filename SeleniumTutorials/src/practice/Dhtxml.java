package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Dhtxml extends Web{
	
	public static void mouseover() throws InterruptedException{
		getDriver().manage().window().maximize();
		WebElement element = getDriver().findElement(By.linkText("Products"));
		Actions action = new Actions(getDriver());
		action.moveToElement(element).build().perform();
		
		WebElement element1 = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
		action.moveToElement(element1).build().perform();

		WebElement element2 = getDriver().findElement(By.cssSelector(".submenu-components__link.m-menu__a"));
		action.moveToElement(element2).click(element2).build().perform();

	
		WebElement element3 = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[4]/a"));
		action.moveToElement(element3).build().perform();
		

		WebElement element4 = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[4]/ul/li[3]/a"));
		action.moveToElement(element4).click(element4).build().perform();
		
		getDriver().findElement(By.id("email")).sendKeys("kpr@gmail.com");
		getDriver().findElement(By.id("license")).sendKeys("12398765412");
		getDriver().findElement(By.xpath(".//*[@type = 'submit']")).click();
		
		String actresult = getDriver().findElement(By.xpath(".//*[@class='submit-error m-bottom-30']")).getText();
		String expresult = ("ERROR: Invalid e-mail or license number");
		Assert.assertEquals(actresult,expresult);
		Thread.sleep(10000);
		
	}

}
