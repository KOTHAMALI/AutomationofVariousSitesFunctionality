package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLinks1 extends Web {
	
	@Test
	
	public static void verification(){
		
		getDriver().manage().window().maximize();
		WebElement element = getDriver().findElement(By.linkText("Products"));
		Actions action = new Actions(getDriver());
		action.moveToElement(element).build().perform();
		
		WebElement element1 = getDriver().findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/ul/li[3]/a"));
		action.moveToElement(element1).build().perform();
		
		WebElement element2 = getDriver().findElement(By.cssSelector(".submenu-components__link.m-menu__a"));
		action.moveToElement(element2).click(element2).build().perform();
		JavascriptExecutor jse = (JavascriptExecutor)getDriver();
		jse.executeScript("scroll(0, 10000);");
		
	WebElement footer =	getDriver().findElement(By.xpath(".//footer[@class = 'dhx-footer']"));
	List<WebElement> actual = footer.findElements(By.tagName("a"));
	List<WebElement>expected = footer.findElements(By.tagName("a"));

			
	
	for(int i=0;i<actual.size();i++)
	{
		
		for(int j=i;j<expected.size();j++)
		{
			
			if(actual.get(i).getText().equals(expected.get(j).getText())){
				
				System.out.println("Links are verified"+ " " +actual.get(i).getText());
				break;
			}
			else if(actual.get(i).getText()!=expected.get(j).getText()){
					Assert.fail("Links are missing ");
				break;
			}
	
		}
	}
	}
	}


