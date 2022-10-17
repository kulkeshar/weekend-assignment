package weekendwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class webelemementsmethod {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\rkulk\\OneDrive\\Desktop\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://automationpractice.com/index.php");
		
		//sendKeys
		
		//driver.findElement(By.id("search_query_top")).sendKeys("Printed Summer Dress");
		
		//click
		//driver.findElement(By.name("submit_search")).click();
		
		// getAttribute()
		// String yes=driver.findElement(By.cssSelector("input[class=\"search_query form-control ac_input\"]")).getAttribute("type");
		 //System.out.println(yes);
		 
		 
		// getText()
		// String yes1=driver.findElement(By.tagName("span")).getText();
		// System.out.println(yes1);
		 
		//getTagName()
		// String yes2=driver.findElement(By.id("search_query_top")).getTagName();
         // System.out.println(yes2);
          
          driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
          driver.manage().window().maximize();
        
       // isDisplayed()
          boolean veg=driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isDisplayed();
          System.out.println(veg);
          
       // isEnabled()
         boolean color=driver.findElement(By.cssSelector("input[value=\"purple\"]")).isEnabled();
          System.out.println(color);
          
          
       // isSelected()
          boolean color1=driver.findElement(By.cssSelector("input[value=\"yellow\"]")).isSelected();
          System.out.println(color1);
          
          driver.findElement(By.cssSelector("input[value=\"green\"]")).click();
          boolean color2=driver.findElement(By.cssSelector("input[value=\"green\"]")).isSelected();
          System.out.println(color2);
          
       // getSize()
        
          System.out.println(driver.findElement(By.cssSelector("input[value=\"orange\"]")).getSize());
          
        //getLocation()
          System.out.println(driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).getLocation());
          
          
       // getCssValue()
        String color4=  driver.findElement(By.tagName("input")).getCssValue("color");
        System.out.println(color4);
        
        
	}    

	}


