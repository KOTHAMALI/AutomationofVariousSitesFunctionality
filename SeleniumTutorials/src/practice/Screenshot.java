package practice;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

public class Screenshot extends Web {
	


	public static void screen(String filename) throws Exception {
		try {
			
			TakesScreenshot ts=(TakesScreenshot)getDriver();
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			String timeStamp = new SimpleDateFormat("MM_dd_yyyy HH_mm_ss").format(Calendar.getInstance().getTime());
			FileUtils.copyFile(src, new File( "./ScreenshotsStore/"+timeStamp + filename+".png"));
			
		} catch (IOException e) {
			
		System.out.println("Exception during screenshot capturing" +e.getMessage());
		} 
		}
	
                 @Test
				public static void screenshot() throws Exception{
	          try{
	        	  
	        	  getDriver().findElement(By.id("kpr")).sendKeys("Selenium Training");
	        	  
	          }catch(Exception e){
	        	  
	        	  screen("Testfailure");
		
               }
                 }
                   }




