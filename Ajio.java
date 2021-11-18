package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/");
		
			//2. In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")).sendKeys("bags",Keys.ENTER);
		
			//3. To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for=\"Men\"]")).click();
		Thread.sleep(3000);
			//4. Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(3000);
			//5. Print the count of the items Found.
		
		String itemcount= driver.findElement(By.className("length")).getText();
		System.out.println(itemcount);
		
		
			//6. Get the list of brand of the products displayed in the page and print the list.
	
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());
		
		System.out.println("-----BAG BRANDS-------");
				 for (WebElement webElement1 : bagBrandList) {
					 String brandtext1 = webElement1.getText();
					 
						System.out.println(brandtext1);
				 }
				 

				 List<WebElement> bagNameList = driver.findElements(By.className("name"));
					System.out.println(" Size :" + bagNameList.size());
					System.out.println(" -----Names of the Bags-----");
					for (WebElement webElement : bagNameList) {
						String text = webElement.getText();
						System.out.println(text);
					 
					 
					 
				 }
						
			//7. Get the list of names of the bags and print it
		
	}

}
