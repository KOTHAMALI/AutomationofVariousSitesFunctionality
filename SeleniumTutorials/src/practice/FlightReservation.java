package practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightReservation extends Web{


	@Test
	public void ticketbookinfo() throws InterruptedException {
		getDriver().findElement(By.id("tab-flight-tab")).click();
		getDriver().findElement(By.id("flight-origin")).sendKeys("New York");
		Thread.sleep(3000);
		
		List<WebElement> list = getDriver().findElements(By.className("results-item"));
		for (WebElement element : list) {
			
			if (element.getText().contains("LGA - LaGuardia")) {
				element.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-destination")).sendKeys("las");
		List<WebElement> list1 = getDriver().findElements(By.className("main-suggestion"));
		for (WebElement element1 : list1) {
			if (element1.getText().contains("Las Vegas")) {
				element1.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-departing")).click();
		List<WebElement> list2 = getDriver().findElements(By.className("datepicker-cal-date"));
		for (WebElement element2 : list2) {
			if (element2.getText().contains("17")) {
				element2.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-returning")).click();
		List<WebElement> list4 = getDriver().findElements(By.className("datepicker-cal-date"));
		for (WebElement element3 : list4) {
			if (element3.getText().contains("19")) {
				element3.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-adults")).click();
		Select dropdown = new Select(getDriver().findElement(By.id("flight-adults")));
		List<WebElement> list5 = dropdown.getOptions();
		for (WebElement element4 : list5) {
			if (element4.getText().contains("4")) {
				element4.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-children")).click();
		Select dropdown1 = new Select(getDriver().findElement(By.id("flight-children")));
		List<WebElement> list6 = dropdown1.getOptions();
		for (WebElement element5 : list6) {
			if (element5.getText().contains("1")) {
				element5.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("flight-age-select-1")).click();
		Select dropdown2 = new Select(getDriver().findElement(By.id("flight-age-select-1")));
		List<WebElement> list7 = dropdown2.getOptions();
		for (WebElement element6 : list7) {
			if (element6.getText().contains("4")) {
				element6.click();
				break;
			}
		}
		
		getDriver().findElement(By.id("search-button")).click();
		String actualresult = getDriver().findElement(By.className("title-city-text")).getText();
		String expectedresult = "Select your departure to Las Vegas";
		Assert.assertEquals(actualresult, expectedresult);

	}

}

